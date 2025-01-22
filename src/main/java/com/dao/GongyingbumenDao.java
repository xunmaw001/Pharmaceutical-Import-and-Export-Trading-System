package com.dao;

import com.entity.GongyingbumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingbumenVO;
import com.entity.view.GongyingbumenView;


/**
 * 供应部门
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:44
 */
public interface GongyingbumenDao extends BaseMapper<GongyingbumenEntity> {
	
	List<GongyingbumenVO> selectListVO(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
	
	GongyingbumenVO selectVO(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
	
	List<GongyingbumenView> selectListView(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);

	List<GongyingbumenView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
	
	GongyingbumenView selectView(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
	

}
