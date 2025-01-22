package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 客户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:45
 */
@TableName("kehu")
public class KehuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KehuEntity() {
		
	}
	
	public KehuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 客户名称
	 */
					
	private String kehumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
