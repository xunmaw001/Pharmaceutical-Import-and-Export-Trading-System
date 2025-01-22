package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuoqiyaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuoqiyaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoqiyaopinView;


/**
 * 过期药品
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface GuoqiyaopinService extends IService<GuoqiyaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuoqiyaopinVO> selectListVO(Wrapper<GuoqiyaopinEntity> wrapper);
   	
   	GuoqiyaopinVO selectVO(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
   	
   	List<GuoqiyaopinView> selectListView(Wrapper<GuoqiyaopinEntity> wrapper);
   	
   	GuoqiyaopinView selectView(@Param("ew") Wrapper<GuoqiyaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuoqiyaopinEntity> wrapper);
   	

}

