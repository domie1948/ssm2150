package com.dao;

import com.entity.ShixinheimingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixinheimingdanVO;
import com.entity.view.ShixinheimingdanView;


/**
 * 失信黑名单
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ShixinheimingdanDao extends BaseMapper<ShixinheimingdanEntity> {
	
	List<ShixinheimingdanVO> selectListVO(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
	
	ShixinheimingdanVO selectVO(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
	
	List<ShixinheimingdanView> selectListView(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);

	List<ShixinheimingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
	
	ShixinheimingdanView selectView(@Param("ew") Wrapper<ShixinheimingdanEntity> wrapper);
	
}
