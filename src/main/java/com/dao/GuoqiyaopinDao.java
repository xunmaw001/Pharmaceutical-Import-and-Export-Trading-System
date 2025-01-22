package com.dao;

import com.entity.GuoqiyaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuoqiyaopinVO;
import com.entity.view.GuoqiyaopinView;


/**
 * 过期药品
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface GuoqiyaopinDao extends BaseMapper<GuoqiyaopinEntity> {
	
	List<GuoqiyaopinVO> selectListVO(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
	
	GuoqiyaopinVO selectVO(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
	
	List<GuoqiyaopinView> selectListView(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);

	List<GuoqiyaopinView> selectListView(Pagination page,@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
	
	GuoqiyaopinView selectView(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
	

}
