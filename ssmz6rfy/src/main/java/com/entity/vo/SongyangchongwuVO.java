package com.entity.vo;

import com.entity.SongyangchongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 送养宠物
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public class SongyangchongwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
