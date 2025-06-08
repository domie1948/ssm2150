package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangchenggongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangchenggongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangchenggongView;


/**
 * 领养成功
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface LingyangchenggongService extends IService<LingyangchenggongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangchenggongVO> selectListVO(Wrapper<LingyangchenggongEntity> wrapper);
   	
   	LingyangchenggongVO selectVO(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
   	
   	List<LingyangchenggongView> selectListView(Wrapper<LingyangchenggongEntity> wrapper);
   	
   	LingyangchenggongView selectView(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangchenggongEntity> wrapper);
   	
}

