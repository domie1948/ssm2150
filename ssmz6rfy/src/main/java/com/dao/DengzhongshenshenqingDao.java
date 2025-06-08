package com.dao;

import com.entity.DengzhongshenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DengzhongshenshenqingVO;
import com.entity.view.DengzhongshenshenqingView;


/**
 * 等终审申请
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DengzhongshenshenqingDao extends BaseMapper<DengzhongshenshenqingEntity> {
	
	List<DengzhongshenshenqingVO> selectListVO(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
	
	DengzhongshenshenqingVO selectVO(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
	
	List<DengzhongshenshenqingView> selectListView(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);

	List<DengzhongshenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
	
	DengzhongshenshenqingView selectView(@Param("ew") Wrapper<DengzhongshenshenqingEntity> wrapper);
	
}
