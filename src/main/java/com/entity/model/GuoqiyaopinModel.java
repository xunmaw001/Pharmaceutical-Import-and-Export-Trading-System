package com.entity.model;

import com.entity.GuoqiyaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 过期药品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public class GuoqiyaopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 药品正式名
	 */
	
	private String yaopinzhengshiming;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 单位
	 */
	
	private String danwei;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 药品数量
	 */
	
	private Integer yaopinshuliang;
		
	/**
	 * 药品进价
	 */
	
	private String yaopinjinjia;
		
	/**
	 * 药品售价
	 */
	
	private String yaopinshoujia;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：药品正式名
	 */
	 
	public void setYaopinzhengshiming(String yaopinzhengshiming) {
		this.yaopinzhengshiming = yaopinzhengshiming;
	}
	
	/**
	 * 获取：药品正式名
	 */
	public String getYaopinzhengshiming() {
		return yaopinzhengshiming;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：单位
	 */
	 
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	
	/**
	 * 获取：单位
	 */
	public String getDanwei() {
		return danwei;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：药品数量
	 */
	 
	public void setYaopinshuliang(Integer yaopinshuliang) {
		this.yaopinshuliang = yaopinshuliang;
	}
	
	/**
	 * 获取：药品数量
	 */
	public Integer getYaopinshuliang() {
		return yaopinshuliang;
	}
				
	
	/**
	 * 设置：药品进价
	 */
	 
	public void setYaopinjinjia(String yaopinjinjia) {
		this.yaopinjinjia = yaopinjinjia;
	}
	
	/**
	 * 获取：药品进价
	 */
	public String getYaopinjinjia() {
		return yaopinjinjia;
	}
				
	
	/**
	 * 设置：药品售价
	 */
	 
	public void setYaopinshoujia(String yaopinshoujia) {
		this.yaopinshoujia = yaopinshoujia;
	}
	
	/**
	 * 获取：药品售价
	 */
	public String getYaopinshoujia() {
		return yaopinshoujia;
	}
			
}
