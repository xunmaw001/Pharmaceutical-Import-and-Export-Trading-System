package com.dao;

import com.entity.KehudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehudingdanVO;
import com.entity.view.KehudingdanView;


/**
 * 客户订单
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface KehudingdanDao extends BaseMapper<KehudingdanEntity> {
	
	List<KehudingdanVO> selectListVO(@Param("ew") Wrapper<KehudingdanEntity> wrapper);
	
	KehudingdanVO selectVO(@Param("ew") Wrapper<KehudingdanEntity> wrapper);
	
	List<KehudingdanView> selectListView(@Param("ew") Wrapper<KehudingdanEntity> wrapper);

	List<KehudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<KehudingdanEntity> wrapper);
	
	KehudingdanView selectView(@Param("ew") Wrapper<KehudingdanEntity> wrapper);
	

}
