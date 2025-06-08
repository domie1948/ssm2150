package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiquleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiquleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiquleixingView;


/**
 * 地区类型
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DiquleixingService extends IService<DiquleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiquleixingVO> selectListVO(Wrapper<DiquleixingEntity> wrapper);
   	
   	DiquleixingVO selectVO(@Param("ew") Wrapper<DiquleixingEntity> wrapper);
   	
   	List<DiquleixingView> selectListView(Wrapper<DiquleixingEntity> wrapper);
   	
   	DiquleixingView selectView(@Param("ew") Wrapper<DiquleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiquleixingEntity> wrapper);
   	
}

