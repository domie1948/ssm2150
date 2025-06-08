package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SongyangrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SongyangrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SongyangrenView;


/**
 * 送养人
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface SongyangrenService extends IService<SongyangrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SongyangrenVO> selectListVO(Wrapper<SongyangrenEntity> wrapper);
   	
   	SongyangrenVO selectVO(@Param("ew") Wrapper<SongyangrenEntity> wrapper);
   	
   	List<SongyangrenView> selectListView(Wrapper<SongyangrenEntity> wrapper);
   	
   	SongyangrenView selectView(@Param("ew") Wrapper<SongyangrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SongyangrenEntity> wrapper);
   	
}

