package com.entity.view;

import com.entity.GuoqiyaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 过期药品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
@TableName("guoqiyaopin")
public class GuoqiyaopinView  extends GuoqiyaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuoqiyaopinView(){
	}
 
 	public GuoqiyaopinView(GuoqiyaopinEntity guoqiyaopinEntity){
 	try {
			BeanUtils.copyProperties(this, guoqiyaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
