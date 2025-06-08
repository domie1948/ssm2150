package com.dao;

import com.entity.ChongwuxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuxiuVO;
import com.entity.view.ChongwuxiuView;


/**
 * 宠物秀
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ChongwuxiuDao extends BaseMapper<ChongwuxiuEntity> {
	
	List<ChongwuxiuVO> selectListVO(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
	
	ChongwuxiuVO selectVO(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
	
	List<ChongwuxiuView> selectListView(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);

	List<ChongwuxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
	
	ChongwuxiuView selectView(@Param("ew") Wrapper<ChongwuxiuEntity> wrapper);
	
}
