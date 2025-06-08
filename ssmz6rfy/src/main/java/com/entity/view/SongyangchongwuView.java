package com.entity.view;

import com.entity.SongyangchongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 送养宠物
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("songyangchongwu")
public class SongyangchongwuView  extends SongyangchongwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SongyangchongwuView(){
	}
 
 	public SongyangchongwuView(SongyangchongwuEntity songyangchongwuEntity){
 	try {
			BeanUtils.copyProperties(this, songyangchongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
