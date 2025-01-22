package com.entity.view;

import com.entity.TuihuodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退货订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
@TableName("tuihuodingdan")
public class TuihuodingdanView  extends TuihuodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuihuodingdanView(){
	}
 
 	public TuihuodingdanView(TuihuodingdanEntity tuihuodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, tuihuodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
