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
 * 送养宠物
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("songyangchongwu")
public class SongyangchongwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SongyangchongwuEntity() {
		
	}
	
	public SongyangchongwuEntity(T t) {
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
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 宠物照片
	 */
					
	private String chongwuzhaopian;
	
	/**
	 * 宠物地址
	 */
					
	private String chongwudizhi;
	
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 送养号
	 */
					
	private String songyanghao;
	
	/**
	 * 送养名
	 */
					
	private String songyangming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 送养状态
	 */
					
	private String songyangzhuangtai;
	
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
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
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
	 * 设置：宠物地址
	 */
	public void setChongwudizhi(String chongwudizhi) {
		this.chongwudizhi = chongwudizhi;
	}
	/**
	 * 获取：宠物地址
	 */
	public String getChongwudizhi() {
		return chongwudizhi;
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
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
	 * 设置：送养状态
	 */
	public void setSongyangzhuangtai(String songyangzhuangtai) {
		this.songyangzhuangtai = songyangzhuangtai;
	}
	/**
	 * 获取：送养状态
	 */
	public String getSongyangzhuangtai() {
		return songyangzhuangtai;
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
