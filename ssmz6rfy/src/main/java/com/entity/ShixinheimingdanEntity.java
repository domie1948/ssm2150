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
 * 失信黑名单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("shixinheimingdan")
public class ShixinheimingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixinheimingdanEntity() {
		
	}
	
	public ShixinheimingdanEntity(T t) {
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
	 * 失信人
	 */
					
	private String shixinren;
	
	/**
	 * 微信号
	 */
					
	private String weixinhao;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 举报时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jubaoshijian;
	
	/**
	 * 举报图片
	 */
					
	private String jubaotupian;
	
	/**
	 * 送养号
	 */
					
	private String songyanghao;
	
	/**
	 * 送养名
	 */
					
	private String songyangming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：失信人
	 */
	public void setShixinren(String shixinren) {
		this.shixinren = shixinren;
	}
	/**
	 * 获取：失信人
	 */
	public String getShixinren() {
		return shixinren;
	}
	/**
	 * 设置：微信号
	 */
	public void setWeixinhao(String weixinhao) {
		this.weixinhao = weixinhao;
	}
	/**
	 * 获取：微信号
	 */
	public String getWeixinhao() {
		return weixinhao;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：地区
	 */
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
	/**
	 * 设置：举报时间
	 */
	public void setJubaoshijian(Date jubaoshijian) {
		this.jubaoshijian = jubaoshijian;
	}
	/**
	 * 获取：举报时间
	 */
	public Date getJubaoshijian() {
		return jubaoshijian;
	}
	/**
	 * 设置：举报图片
	 */
	public void setJubaotupian(String jubaotupian) {
		this.jubaotupian = jubaotupian;
	}
	/**
	 * 获取：举报图片
	 */
	public String getJubaotupian() {
		return jubaotupian;
	}
	/**
	 * 设置：送养号
	 */
	public void setSongyanghao(String songyanghao) {
		this.songyanghao = songyanghao;
	}
	/**
	 * 获取：送养号
	 */
	public String getSongyanghao() {
		return songyanghao;
	}
	/**
	 * 设置：送养名
	 */
	public void setSongyangming(String songyangming) {
		this.songyangming = songyangming;
	}
	/**
	 * 获取：送养名
	 */
	public String getSongyangming() {
		return songyangming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
