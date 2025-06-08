package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaozhongshenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaozhongshenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaozhongshenshenqingView;


/**
 * 取消终审申请
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaozhongshenshenqingService extends IService<QuxiaozhongshenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaozhongshenshenqingVO> selectListVO(Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
   	
   	QuxiaozhongshenshenqingVO selectVO(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
   	
   	List<QuxiaozhongshenshenqingView> selectListView(Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
   	
   	QuxiaozhongshenshenqingView selectView(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
   	
}

