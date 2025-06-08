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


import com.dao.DiquleixingDao;
import com.entity.DiquleixingEntity;
import com.service.DiquleixingService;
import com.entity.vo.DiquleixingVO;
import com.entity.view.DiquleixingView;

@Service("diquleixingService")
public class DiquleixingServiceImpl extends ServiceImpl<DiquleixingDao, DiquleixingEntity> implements DiquleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiquleixingEntity> page = this.selectPage(
                new Query<DiquleixingEntity>(params).getPage(),
                new EntityWrapper<DiquleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiquleixingEntity> wrapper) {
		  Page<DiquleixingView> page =new Query<DiquleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiquleixingVO> selectListVO(Wrapper<DiquleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiquleixingVO selectVO(Wrapper<DiquleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiquleixingView> selectListView(Wrapper<DiquleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiquleixingView selectView(Wrapper<DiquleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
