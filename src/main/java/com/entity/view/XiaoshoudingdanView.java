package com.entity.view;

import com.entity.XiaoshoudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
@TableName("xiaoshoudingdan")
public class XiaoshoudingdanView  extends XiaoshoudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshoudingdanView(){
	}
 
 	public XiaoshoudingdanView(XiaoshoudingdanEntity xiaoshoudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshoudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
