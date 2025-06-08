package com.dao;

import com.entity.QuxiaoshenqinglingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoshenqinglingyangVO;
import com.entity.view.QuxiaoshenqinglingyangView;


/**
 * 取消申请领养
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface QuxiaoshenqinglingyangDao extends BaseMapper<QuxiaoshenqinglingyangEntity> {
	
	List<QuxiaoshenqinglingyangVO> selectListVO(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
	
	QuxiaoshenqinglingyangVO selectVO(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
	
	List<QuxiaoshenqinglingyangView> selectListView(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);

	List<QuxiaoshenqinglingyangView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
	
	QuxiaoshenqinglingyangView selectView(@Param("ew") Wrapper<QuxiaoshenqinglingyangEntity> wrapper);
	
}
