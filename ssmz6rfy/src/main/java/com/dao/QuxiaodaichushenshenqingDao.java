package com.dao;

import com.entity.QuxiaodaichushenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaodaichushenshenqingVO;
import com.entity.view.QuxiaodaichushenshenqingView;


/**
 * 取消待初审申请
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaodaichushenshenqingDao extends BaseMapper<QuxiaodaichushenshenqingEntity> {
	
	List<QuxiaodaichushenshenqingVO> selectListVO(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
	
	QuxiaodaichushenshenqingVO selectVO(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
	
	List<QuxiaodaichushenshenqingView> selectListView(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);

	List<QuxiaodaichushenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
	
	QuxiaodaichushenshenqingView selectView(@Param("ew") Wrapper<QuxiaodaichushenshenqingEntity> wrapper);
	
}
