package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqinglingyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqinglingyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqinglingyangView;


/**
 * 申请领养
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ShenqinglingyangService extends IService<ShenqinglingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqinglingyangVO> selectListVO(Wrapper<ShenqinglingyangEntity> wrapper);
   	
   	ShenqinglingyangVO selectVO(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
   	
   	List<ShenqinglingyangView> selectListView(Wrapper<ShenqinglingyangEntity> wrapper);
   	
   	ShenqinglingyangView selectView(@Param("ew") Wrapper<ShenqinglingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqinglingyangEntity> wrapper);
   	
}

