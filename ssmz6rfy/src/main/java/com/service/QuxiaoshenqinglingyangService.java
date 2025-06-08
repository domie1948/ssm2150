package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaoshenqinglingyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaoshenqinglingyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaoshenqinglingyangView;


/**
 * 取消申请领养
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaoshenqinglingyangService extends IService<QuxiaoshenqinglingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoshenqinglingyangVO> selectListVO(Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
   	
   	QuxiaoshenqinglingyangVO selectVO(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
   	
   	List<QuxiaoshenqinglingyangView> selectListView(Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
   	
   	QuxiaoshenqinglingyangView selectView(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
   	
}

