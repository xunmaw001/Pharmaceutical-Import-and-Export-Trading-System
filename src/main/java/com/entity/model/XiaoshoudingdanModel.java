package com.entity.model;

import com.entity.XiaoshoudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
public class XiaoshoudingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品编号
	 */
	
	private String yaopinbianhao;
		
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
	 * 药品数量
	 */
	
	private Integer yaopinshuliang;
		
	/**
	 * 药品售价
	 */
	
	private Float yaopinshoujia;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 客户名称
	 */
	
	private String kehumingcheng;
		
	/**
	 * 客户电话
	 */
	
	private String kehudianhua;
		
	/**
	 * 客户地址
	 */
	
	private String kehudizhi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：药品编号
	 */
	 
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
				
	
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
	 * 设置：药品售价
	 */
	 
	public void setYaopinshoujia(Float yaopinshoujia) {
		this.yaopinshoujia = yaopinshoujia;
	}
	
	/**
	 * 获取：药品售价
	 */
	public Float getYaopinshoujia() {
		return yaopinshoujia;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：客户名称
	 */
	 
	public void setKehumingcheng(String kehumingcheng) {
		this.kehumingcheng = kehumingcheng;
	}
	
	/**
	 * 获取：客户名称
	 */
	public String getKehumingcheng() {
		return kehumingcheng;
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
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
