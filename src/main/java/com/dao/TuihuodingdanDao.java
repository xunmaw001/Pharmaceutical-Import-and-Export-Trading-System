package com.dao;

import com.entity.TuihuodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuihuodingdanVO;
import com.entity.view.TuihuodingdanView;


/**
 * 退货订单
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface TuihuodingdanDao extends BaseMapper<TuihuodingdanEntity> {
	
	List<TuihuodingdanVO> selectListVO(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
	
	TuihuodingdanVO selectVO(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
	
	List<TuihuodingdanView> selectListView(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);

	List<TuihuodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
	
	TuihuodingdanView selectView(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
	

}
