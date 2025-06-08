package com.dao;

import com.entity.ShouyangrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouyangrenVO;
import com.entity.view.ShouyangrenView;


/**
 * 收养人
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface ShouyangrenDao extends BaseMapper<ShouyangrenEntity> {
	
	List<ShouyangrenVO> selectListVO(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
	
	ShouyangrenVO selectVO(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
	
	List<ShouyangrenView> selectListView(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);

	List<ShouyangrenView> selectListView(Pagination page,@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
	
	ShouyangrenView selectView(@Param("ew") Wrapper<ShouyangrenEntity> wrapper);
	
}
