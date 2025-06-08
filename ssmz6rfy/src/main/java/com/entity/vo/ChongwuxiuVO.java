package com.entity.vo;

import com.entity.ChongwuxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宠物秀
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public class ChongwuxiuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
