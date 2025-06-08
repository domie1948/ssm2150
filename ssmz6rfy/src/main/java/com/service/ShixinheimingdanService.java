package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixinheimingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixinheimingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixinheimingdanView;


/**
 * 失信黑名单
 *
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ShixinheimingdanService extends IService<ShixinheimingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixinheimingdanVO> selectListVO(Wrapper<ShixinheimingdanEntity> wrapper);
   	
   	ShixinheimingdanVO selectVO(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
   	
   	List<ShixinheimingdanView> selectListView(Wrapper<ShixinheimingdanEntity> wrapper);
   	
   	ShixinheimingdanView selectView(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixinheimingdanEntity> wrapper);
   	
}

