package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SongyangchongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SongyangchongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SongyangchongwuView;


/**
 * 送养宠物
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface SongyangchongwuService extends IService<SongyangchongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SongyangchongwuVO> selectListVO(Wrapper<SongyangchongwuEntity> wrapper);
   	
   	SongyangchongwuVO selectVO(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
   	
   	List<SongyangchongwuView> selectListView(Wrapper<SongyangchongwuEntity> wrapper);
   	
   	SongyangchongwuView selectView(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SongyangchongwuEntity> wrapper);
   	
}

