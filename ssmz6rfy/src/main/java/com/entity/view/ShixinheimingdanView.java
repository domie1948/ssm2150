package com.entity.view;

import com.entity.ShixinheimingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失信黑名单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("shixinheimingdan")
public class ShixinheimingdanView  extends ShixinheimingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixinheimingdanView(){
	}
 
 	public ShixinheimingdanView(ShixinheimingdanEntity shixinheimingdanEntity){
 	try {
			BeanUtils.copyProperties(this, shixinheimingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
