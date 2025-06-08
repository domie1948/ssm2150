package com.entity.vo;

import com.entity.ShixinheimingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 失信黑名单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public class ShixinheimingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
