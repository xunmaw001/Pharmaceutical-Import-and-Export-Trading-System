package com.dao;

import com.entity.YaopinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinrukuVO;
import com.entity.view.YaopinrukuView;


/**
 * 药品入库
 * 
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface YaopinrukuDao extends BaseMapper<YaopinrukuEntity> {
	
	List<YaopinrukuVO> selectListVO(@Param("ew") Wrapper<YaopinrukuEntity> wrapper);
	
	YaopinrukuVO selectVO(@Param("ew") Wrapper<YaopinrukuEntity> wrapper);
	
	List<YaopinrukuView> selectListView(@Param("ew") Wrapper<YaopinrukuEntity> wrapper);

	List<YaopinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinrukuEntity> wrapper);
	
	YaopinrukuView selectView(@Param("ew") Wrapper<YaopinrukuEntity> wrapper);
	

}
