package com.entity.vo;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public class KehuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 客户来源
	 */
	
	private String kehulaiyuan;
		
	/**
	 * 行业
	 */
	
	private String xingye;
		
	/**
	 * 国家地区
	 */
	
	private String guojiadiqu;
		
	/**
	 * 客户电话
	 */
	
	private String kehudianhua;
		
	/**
	 * 客户地址
	 */
	
	private String kehudizhi;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：客户来源
	 */
	 
	public void setKehulaiyuan(String kehulaiyuan) {
		this.kehulaiyuan = kehulaiyuan;
	}
	
	/**
	 * 获取：客户来源
	 */
	public String getKehulaiyuan() {
		return kehulaiyuan;
	}
				
	
	/**
	 * 设置：行业
	 */
	 
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
	}
				
	
	/**
	 * 设置：国家地区
	 */
	 
	public void setGuojiadiqu(String guojiadiqu) {
		this.guojiadiqu = guojiadiqu;
	}
	
	/**
	 * 获取：国家地区
	 */
	public String getGuojiadiqu() {
		return guojiadiqu;
	}
				
	
	/**
	 * 设置：客户电话
	 */
	 
	public void setKehudianhua(String kehudianhua) {
		this.kehudianhua = kehudianhua;
	}
	
	/**
	 * 获取：客户电话
	 */
	public String getKehudianhua() {
		return kehudianhua;
	}
				
	
	/**
	 * 设置：客户地址
	 */
	 
	public void setKehudizhi(String kehudizhi) {
		this.kehudizhi = kehudizhi;
	}
	
	/**
	 * 获取：客户地址
	 */
	public String getKehudizhi() {
		return kehudizhi;
	}
			
}
