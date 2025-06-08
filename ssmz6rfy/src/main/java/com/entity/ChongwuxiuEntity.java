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
 * 宠物秀
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("chongwuxiu")
public class ChongwuxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuxiuEntity() {
		
	}
	
	public ChongwuxiuEntity(T t) {
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
	 * 宠物动态
	 */
					
	private String chongwudongtai;
	
	/**
	 * 宠物照片
	 */
					
	private String chongwuzhaopian;
	
	/**
	 * 收养号
	 */
					
	private String shouyanghao;
	
	/**
	 * 收养名
	 */
					
	private String shouyangming;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
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
	 * 设置：宠物动态
	 */
	public void setChongwudongtai(String chongwudongtai) {
		this.chongwudongtai = chongwudongtai;
	}
	/**
	 * 获取：宠物动态
	 */
	public String getChongwudongtai() {
		return chongwudongtai;
	}
	/**
	 * 设置：宠物照片
	 */
	public void setChongwuzhaopian(String chongwuzhaopian) {
		this.chongwuzhaopian = chongwuzhaopian;
	}
	/**
	 * 获取：宠物照片
	 */
	public String getChongwuzhaopian() {
		return chongwuzhaopian;
	}
	/**
	 * 设置：收养号
	 */
	public void setShouyanghao(String shouyanghao) {
		this.shouyanghao = shouyanghao;
	}
	/**
	 * 获取：收养号
	 */
	public String getShouyanghao() {
		return shouyanghao;
	}
	/**
	 * 设置：收养名
	 */
	public void setShouyangming(String shouyangming) {
		this.shouyangming = shouyangming;
	}
	/**
	 * 获取：收养名
	 */
	public String getShouyangming() {
		return shouyangming;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
