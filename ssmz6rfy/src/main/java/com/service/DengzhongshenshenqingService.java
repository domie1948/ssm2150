package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DengzhongshenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DengzhongshenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DengzhongshenshenqingView;


/**
 * 等终审申请
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DengzhongshenshenqingService extends IService<DengzhongshenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DengzhongshenshenqingVO> selectListVO(Wrapper<DengzhongshenshenqingEntity> wrapper);
   	
   	DengzhongshenshenqingVO selectVO(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
   	
   	List<DengzhongshenshenqingView> selectListView(Wrapper<DengzhongshenshenqingEntity> wrapper);
   	
   	DengzhongshenshenqingView selectView(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DengzhongshenshenqingEntity> wrapper);
   	
}

