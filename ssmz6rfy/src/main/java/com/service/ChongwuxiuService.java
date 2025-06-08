package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuxiuView;


/**
 * 宠物秀
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ChongwuxiuService extends IService<ChongwuxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuxiuVO> selectListVO(Wrapper<ChongwuxiuEntity> wrapper);
   	
   	ChongwuxiuVO selectVO(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
   	
   	List<ChongwuxiuView> selectListView(Wrapper<ChongwuxiuEntity> wrapper);
   	
   	ChongwuxiuView selectView(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuxiuEntity> wrapper);
   	
}

