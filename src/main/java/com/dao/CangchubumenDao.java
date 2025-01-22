package com.dao;

import com.entity.CangchubumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangchubumenVO;
import com.entity.view.CangchubumenView;


/**
 * 仓储部门
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:44
 */
public interface CangchubumenDao extends BaseMapper<CangchubumenEntity> {
	
	List<CangchubumenVO> selectListVO(@Param("ew") Wrapper<CangchubumenEntity> wrapper);
	
	CangchubumenVO selectVO(@Param("ew") Wrapper<CangchubumenEntity> wrapper);
	
	List<CangchubumenView> selectListView(@Param("ew") Wrapper<CangchubumenEntity> wrapper);

	List<CangchubumenView> selectListView(Pagination page,@Param("ew") Wrapper<CangchubumenEntity> wrapper);
	
	CangchubumenView selectView(@Param("ew") Wrapper<CangchubumenEntity> wrapper);
	

}
