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
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-03 21:32:44
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
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
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 产地
	 */
					
	private String chandi;
	
	/**
	 * 报号
	 */
					
	private String baohao;
	
	/**
	 * 有效期
	 */
					
	private String youxiaoqi;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 批准文号
	 */
					
	private String pizhunwenhao;
	
	/**
	 * 药品数量
	 */
					
	private Integer yaopinshuliang;
	
	/**
	 * 药品进价
	 */
					
	private Float yaopinjinjia;
	
	/**
	 * 药品售价
	 */
					
	private Float yaopinshoujia;
	
	
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
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
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
	 * 设置：报号
	 */
	public void setBaohao(String baohao) {
		this.baohao = baohao;
	}
	/**
	 * 获取：报号
	 */
	public String getBaohao() {
		return baohao;
	}
	/**
	 * 设置：有效期
	 */
	public void setYouxiaoqi(String youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	/**
	 * 获取：有效期
	 */
	public String getYouxiaoqi() {
		return youxiaoqi;
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
	 * 设置：批准文号
	 */
	public void setPizhunwenhao(String pizhunwenhao) {
		this.pizhunwenhao = pizhunwenhao;
	}
	/**
	 * 获取：批准文号
	 */
	public String getPizhunwenhao() {
		return pizhunwenhao;
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
	public void setYaopinjinjia(Float yaopinjinjia) {
		this.yaopinjinjia = yaopinjinjia;
	}
	/**
	 * 获取：药品进价
	 */
	public Float getYaopinjinjia() {
		return yaopinjinjia;
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

}
