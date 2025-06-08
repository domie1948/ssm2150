package com.dao;

import com.entity.DaichushenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaichushenshenqingVO;
import com.entity.view.DaichushenshenqingView;


/**
 * 待初审申请
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DaichushenshenqingDao extends BaseMapper<DaichushenshenqingEntity> {
	
	List<DaichushenshenqingVO> selectListVO(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
	
	DaichushenshenqingVO selectVO(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
	
	List<DaichushenshenqingView> selectListView(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);

	List<DaichushenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
	
	DaichushenshenqingView selectView(@Param("ew") Wrapper<DaichushenshenqingEntity> wrapper);
	
}
