package com.dao;

import com.entity.SongyangchongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SongyangchongwuVO;
import com.entity.view.SongyangchongwuView;


/**
 * 送养宠物
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface SongyangchongwuDao extends BaseMapper<SongyangchongwuEntity> {
	
	List<SongyangchongwuVO> selectListVO(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
	
	SongyangchongwuVO selectVO(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
	
	List<SongyangchongwuView> selectListView(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);

	List<SongyangchongwuView> selectListView(Pagination page,@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
	
	SongyangchongwuView selectView(@Param("ew") Wrapper<SongyangchongwuEntity> wrapper);
	
}
