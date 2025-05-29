
package com.controller;


import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ManagerEntity;
import com.entity.ManagerEntity;
import com.service.ManagerService;
import com.service.TokenService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 登录相关
 */
@RequestMapping("manager")
@RestController
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@Autowired
	private TokenService tokenService;

	/**
	 * 登录
	 */
	@IgnoreAuth
	@PostMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ManagerEntity user = managerService.selectOne(new EntityWrapper<ManagerEntity>().eq("username", username));
		if(user==null || !user.getPassword().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(),username, "manager", user.getRole());
		return R.ok().put("token", token);
	}
	
	/**
	 * 注册
	 */
	@IgnoreAuth
	@PostMapping(value = "/register")
	public R register(@RequestBody ManagerEntity user){
//    	ValidatorUtils.validateEntity(user);
    	if(managerService.selectOne(new EntityWrapper<ManagerEntity>().eq("username", user.getUsername())) !=null) {
    		return R.error("用户已存在");
    	}
        managerService.insert(user);
        return R.ok();
    }

	/**
	 * 退出
	 */
	@GetMapping(value = "logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ManagerEntity user = managerService.selectOne(new EntityWrapper<ManagerEntity>().eq("username", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
    	user.setPassword("123456");
        managerService.update(user,null);
        return R.ok("密码已重置为：123456");
    }
	
	/**
     * 列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ManagerEntity user){
        EntityWrapper<ManagerEntity> ew = new EntityWrapper<ManagerEntity>();
    	PageUtils page = managerService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.allLike(ew, user), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/list")
    public R list( ManagerEntity user){
       	EntityWrapper<ManagerEntity> ew = new EntityWrapper<ManagerEntity>();
      	ew.allEq(MPUtil.allEQMapPre( user, "manager"));
        return R.ok().put("data", managerService.selectListView(ew));
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ManagerEntity user = managerService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ManagerEntity user = managerService.selectById(id);
        return R.ok().put("data", user);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody ManagerEntity user){
//    	ValidatorUtils.validateEntity(user);
    	if(managerService.selectOne(new EntityWrapper<ManagerEntity>().eq("username", user.getUsername())) !=null) {
    		return R.error("用户已存在");
    	}
        managerService.insert(user);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ManagerEntity user){
//        ValidatorUtils.validateEntity(user);
    	ManagerEntity u = managerService.selectOne(new EntityWrapper<ManagerEntity>().eq("username", user.getUsername()));
    	if(u!=null && u.getId()!=user.getId() && u.getUsername().equals(user.getUsername())) {
    		return R.error("用户名已存在。");
    	}
        managerService.updateById(user);//全部更新
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        managerService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}
