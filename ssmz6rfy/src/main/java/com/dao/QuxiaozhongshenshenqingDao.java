package com.dao;

import com.entity.QuxiaozhongshenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaozhongshenshenqingVO;
import com.entity.view.QuxiaozhongshenshenqingView;


/**
 * 取消终审申请
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaozhongshenshenqingDao extends BaseMapper<QuxiaozhongshenshenqingEntity> {
	
	List<QuxiaozhongshenshenqingVO> selectListVO(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
	
	QuxiaozhongshenshenqingVO selectVO(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
	
	List<QuxiaozhongshenshenqingView> selectListView(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);

	List<QuxiaozhongshenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
	
	QuxiaozhongshenshenqingView selectView(@Param("ew") Wrapper<QuxiaozhongshenshenqingEntity> wrapper);
	
}
