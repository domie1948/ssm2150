package com.dao;

import com.entity.SongyangrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SongyangrenVO;
import com.entity.view.SongyangrenView;


/**
 * 送养人
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface SongyangrenDao extends BaseMapper<SongyangrenEntity> {
	
	List<SongyangrenVO> selectListVO(@Param("ew") Wrapper<SongyangrenEntity> wrapper);
	
	SongyangrenVO selectVO(@Param("ew") Wrapper<SongyangrenEntity> wrapper);
	
	List<SongyangrenView> selectListView(@Param("ew") Wrapper<SongyangrenEntity> wrapper);

	List<SongyangrenView> selectListView(Pagination page,@Param("ew") Wrapper<SongyangrenEntity> wrapper);
	
	SongyangrenView selectView(@Param("ew") Wrapper<SongyangrenEntity> wrapper);
	
}
