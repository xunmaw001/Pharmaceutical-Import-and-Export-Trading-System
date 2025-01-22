package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangchubumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangchubumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangchubumenView;


/**
 * 仓储部门
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:44
 */
public interface CangchubumenService extends IService<CangchubumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangchubumenVO> selectListVO(Wrapper<CangchubumenEntity> wrapper);
   	
   	CangchubumenVO selectVO(@Param("ew") Wrapper<CangchubumenEntity> wrapper);
   	
   	List<CangchubumenView> selectListView(Wrapper<CangchubumenEntity> wrapper);
   	
   	CangchubumenView selectView(@Param("ew") Wrapper<CangchubumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangchubumenEntity> wrapper);
   	

}

