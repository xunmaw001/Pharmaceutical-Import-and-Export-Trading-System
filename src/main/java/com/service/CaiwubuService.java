package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwubuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwubuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwubuView;


/**
 * 财务部
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface CaiwubuService extends IService<CaiwubuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwubuVO> selectListVO(Wrapper<CaiwubuEntity> wrapper);
   	
   	CaiwubuVO selectVO(@Param("ew") Wrapper<CaiwubuEntity> wrapper);
   	
   	List<CaiwubuView> selectListView(Wrapper<CaiwubuEntity> wrapper);
   	
   	CaiwubuView selectView(@Param("ew") Wrapper<CaiwubuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwubuEntity> wrapper);
   	

}

