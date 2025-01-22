package com.dao;

import com.entity.CaiwubuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwubuVO;
import com.entity.view.CaiwubuView;


/**
 * 财务部
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface CaiwubuDao extends BaseMapper<CaiwubuEntity> {
	
	List<CaiwubuVO> selectListVO(@Param("ew") Wrapper<CaiwubuEntity> wrapper);
	
	CaiwubuVO selectVO(@Param("ew") Wrapper<CaiwubuEntity> wrapper);
	
	List<CaiwubuView> selectListView(@Param("ew") Wrapper<CaiwubuEntity> wrapper);

	List<CaiwubuView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwubuEntity> wrapper);
	
	CaiwubuView selectView(@Param("ew") Wrapper<CaiwubuEntity> wrapper);
	

}
