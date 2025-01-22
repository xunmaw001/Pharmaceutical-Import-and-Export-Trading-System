package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewubumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewubumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewubumenView;


/**
 * 业务部门
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface YewubumenService extends IService<YewubumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewubumenVO> selectListVO(Wrapper<YewubumenEntity> wrapper);
   	
   	YewubumenVO selectVO(@Param("ew") Wrapper<YewubumenEntity> wrapper);
   	
   	List<YewubumenView> selectListView(Wrapper<YewubumenEntity> wrapper);
   	
   	YewubumenView selectView(@Param("ew") Wrapper<YewubumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewubumenEntity> wrapper);
   	

}

