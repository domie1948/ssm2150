package com.dao;

import com.entity.LingyangchenggongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangchenggongVO;
import com.entity.view.LingyangchenggongView;


/**
 * 领养成功
 * 
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
public interface LingyangchenggongDao extends BaseMapper<LingyangchenggongEntity> {
	
	List<LingyangchenggongVO> selectListVO(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
	
	LingyangchenggongVO selectVO(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
	
	List<LingyangchenggongView> selectListView(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);

	List<LingyangchenggongView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
	
	LingyangchenggongView selectView(@Param("ew") Wrapper<LingyangchenggongEntity> wrapper);
	
}
