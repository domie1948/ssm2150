package com.entity.vo;

import com.entity.LingyangchenggongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 领养成功
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public class LingyangchenggongVO  implements Serializable {
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
	 * 送养号
	 */
	
	private String songyanghao;
		
	/**
	 * 送养名
	 */
	
	private String songyangming;
		
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 收养号
	 */
	
	private String shouyanghao;
		
	/**
	 * 收养名
	 */
	
	private String shouyangming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 微信号
	 */
	
	private String weixinhao;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 领养原因
	 */
	
	private String lingyangyuanyin;
		
	/**
	 * 领养协议
	 */
	
	private String lingyangxieyi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：领养原因
	 */
	 
	public void setLingyangyuanyin(String lingyangyuanyin) {
		this.lingyangyuanyin = lingyangyuanyin;
	}
	
	/**
	 * 获取：领养原因
	 */
	public String getLingyangyuanyin() {
		return lingyangyuanyin;
	}
				
	
	/**
	 * 设置：领养协议
	 */
	 
	public void setLingyangxieyi(String lingyangxieyi) {
		this.lingyangxieyi = lingyangxieyi;
	}
	
	/**
	 * 获取：领养协议
	 */
	public String getLingyangxieyi() {
		return lingyangxieyi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
