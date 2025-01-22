package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingbumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingbumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingbumenView;


/**
 * 供应部门
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:44
 */
public interface GongyingbumenService extends IService<GongyingbumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingbumenVO> selectListVO(Wrapper<GongyingbumenEntity> wrapper);
   	
   	GongyingbumenVO selectVO(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
   	
   	List<GongyingbumenView> selectListView(Wrapper<GongyingbumenEntity> wrapper);
   	
   	GongyingbumenView selectView(@Param("ew") Wrapper<GongyingbumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingbumenEntity> wrapper);
   	

}

