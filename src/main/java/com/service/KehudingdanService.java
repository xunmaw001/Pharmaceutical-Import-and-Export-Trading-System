package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehudingdanView;


/**
 * 客户订单
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface KehudingdanService extends IService<KehudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehudingdanVO> selectListVO(Wrapper<KehudingdanEntity> wrapper);
   	
   	KehudingdanVO selectVO(@Param("ew") Wrapper<KehudingdanEntity> wrapper);
   	
   	List<KehudingdanView> selectListView(Wrapper<KehudingdanEntity> wrapper);
   	
   	KehudingdanView selectView(@Param("ew") Wrapper<KehudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehudingdanEntity> wrapper);
   	

}

