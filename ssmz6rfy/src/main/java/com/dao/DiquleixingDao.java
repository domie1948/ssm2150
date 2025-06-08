package com.dao;

import com.entity.DiquleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiquleixingVO;
import com.entity.view.DiquleixingView;


/**
 * 地区类型
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface DiquleixingDao extends BaseMapper<DiquleixingEntity> {
	
	List<DiquleixingVO> selectListVO(@Param("ew") Wrapper<DiquleixingEntity> wrapper);
	
	DiquleixingVO selectVO(@Param("ew") Wrapper<DiquleixingEntity> wrapper);
	
	List<DiquleixingView> selectListView(@Param("ew") Wrapper<DiquleixingEntity> wrapper);

	List<DiquleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DiquleixingEntity> wrapper);
	
	DiquleixingView selectView(@Param("ew") Wrapper<DiquleixingEntity> wrapper);
	
}
