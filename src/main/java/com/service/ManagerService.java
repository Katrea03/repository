
package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ManagerEntity;
import com.entity.UserEntity;
import com.utils.PageUtils;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 */
public interface ManagerService extends IService<ManagerEntity> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<ManagerEntity> selectListView(Wrapper<ManagerEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManagerEntity> wrapper);
	   	
}
