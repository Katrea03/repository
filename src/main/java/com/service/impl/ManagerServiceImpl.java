
package com.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ManagerDao;
import com.dao.UserDao;
import com.entity.ManagerEntity;
import com.entity.UserEntity;
import com.service.ManagerService;
import com.service.UserService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 */
@Service("managerService")
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, ManagerEntity> implements ManagerService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<ManagerEntity> page = this.selectPage(
                new Query<ManagerEntity>(params).getPage(),
                new EntityWrapper<ManagerEntity>()
        );
        return new PageUtils(page);
	}

	@Override
	public List<ManagerEntity> selectListView(Wrapper<ManagerEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params,
			Wrapper<ManagerEntity> wrapper) {
		 Page<ManagerEntity> page =new Query<ManagerEntity>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
	}
}
