
package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ManagerEntity;
import com.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户
 */
public interface ManagerDao extends BaseMapper<ManagerEntity> {
	
	List<ManagerEntity> selectListView(@Param("ew") Wrapper<ManagerEntity> wrapper);

	List<ManagerEntity> selectListView(Pagination page,@Param("ew") Wrapper<ManagerEntity> wrapper);
	
}
