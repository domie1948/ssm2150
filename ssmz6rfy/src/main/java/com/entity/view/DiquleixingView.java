package com.entity.view;

import com.entity.DiquleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地区类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("diquleixing")
public class DiquleixingView  extends DiquleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiquleixingView(){
	}
 
 	public DiquleixingView(DiquleixingEntity diquleixingEntity){
 	try {
			BeanUtils.copyProperties(this, diquleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
