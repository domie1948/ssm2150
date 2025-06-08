package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaichushenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaichushenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaichushenshenqingView;


/**
 * 待初审申请
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DaichushenshenqingService extends IService<DaichushenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaichushenshenqingVO> selectListVO(Wrapper<DaichushenshenqingEntity> wrapper);
   	
   	DaichushenshenqingVO selectVO(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
   	
   	List<DaichushenshenqingView> selectListView(Wrapper<DaichushenshenqingEntity> wrapper);
   	
   	DaichushenshenqingView selectView(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaichushenshenqingEntity> wrapper);
   	
}

