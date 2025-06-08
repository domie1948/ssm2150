package com.entity.model;

import com.entity.SongyangrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 送养人
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public class SongyangrenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 送养名
	 */
	
	private String songyangming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 微信号
	 */
	
	private String weixinhao;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
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
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
