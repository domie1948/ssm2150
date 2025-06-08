package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouyangrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouyangrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouyangrenView;


/**
 * 收养人
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ShouyangrenService extends IService<ShouyangrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouyangrenVO> selectListVO(Wrapper<ShouyangrenEntity> wrapper);
   	
   	ShouyangrenVO selectVO(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
   	
   	List<ShouyangrenView> selectListView(Wrapper<ShouyangrenEntity> wrapper);
   	
   	ShouyangrenView selectView(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouyangrenEntity> wrapper);
   	
}

