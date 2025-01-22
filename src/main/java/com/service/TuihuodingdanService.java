package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuihuodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuihuodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuodingdanView;


/**
 * 退货订单
 *
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public interface TuihuodingdanService extends IService<TuihuodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuodingdanVO> selectListVO(Wrapper<TuihuodingdanEntity> wrapper);
   	
   	TuihuodingdanVO selectVO(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
   	
   	List<TuihuodingdanView> selectListView(Wrapper<TuihuodingdanEntity> wrapper);
   	
   	TuihuodingdanView selectView(@Param("ew") Wrapper<TuihuodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuodingdanEntity> wrapper);
   	

}

