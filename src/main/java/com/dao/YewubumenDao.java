package com.dao;

import com.entity.YewubumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewubumenVO;
import com.entity.view.YewubumenView;


/**
 * 业务部门
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface YewubumenDao extends BaseMapper<YewubumenEntity> {
	
	List<YewubumenVO> selectListVO(@Param("ew") Wrapper<YewubumenEntity> wrapper);
	
	YewubumenVO selectVO(@Param("ew") Wrapper<YewubumenEntity> wrapper);
	
	List<YewubumenView> selectListView(@Param("ew") Wrapper<YewubumenEntity> wrapper);

	List<YewubumenView> selectListView(Pagination page,@Param("ew") Wrapper<YewubumenEntity> wrapper);
	
	YewubumenView selectView(@Param("ew") Wrapper<YewubumenEntity> wrapper);
	

}
