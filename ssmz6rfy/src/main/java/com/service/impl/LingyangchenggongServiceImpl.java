package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LingyangchenggongDao;
import com.entity.LingyangchenggongEntity;
import com.service.LingyangchenggongService;
import com.entity.vo.LingyangchenggongVO;
import com.entity.view.LingyangchenggongView;

@Service("lingyangchenggongService")
public class LingyangchenggongServiceImpl extends ServiceImpl<LingyangchenggongDao, LingyangchenggongEntity> implements LingyangchenggongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangchenggongEntity> page = this.selectPage(
                new Query<LingyangchenggongEntity>(params).getPage(),
                new EntityWrapper<LingyangchenggongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangchenggongEntity> wrapper) {
		  Page<LingyangchenggongView> page =new Query<LingyangchenggongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangchenggongVO> selectListVO(Wrapper<LingyangchenggongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangchenggongVO selectVO(Wrapper<LingyangchenggongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangchenggongView> selectListView(Wrapper<LingyangchenggongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangchenggongView selectView(Wrapper<LingyangchenggongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
