package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaodaichushenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaodaichushenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaodaichushenshenqingView;


/**
 * 取消待初审申请
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaodaichushenshenqingService extends IService<QuxiaodaichushenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaodaichushenshenqingVO> selectListVO(Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
   	
   	QuxiaodaichushenshenqingVO selectVO(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
   	
   	List<QuxiaodaichushenshenqingView> selectListView(Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
   	
   	QuxiaodaichushenshenqingView selectView(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
   	
}

