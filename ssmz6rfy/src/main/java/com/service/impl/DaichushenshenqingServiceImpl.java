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


import com.dao.DaichushenshenqingDao;
import com.entity.DaichushenshenqingEntity;
import com.service.DaichushenshenqingService;
import com.entity.vo.DaichushenshenqingVO;
import com.entity.view.DaichushenshenqingView;

@Service("daichushenshenqingService")
public class DaichushenshenqingServiceImpl extends ServiceImpl<DaichushenshenqingDao, DaichushenshenqingEntity> implements DaichushenshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaichushenshenqingEntity> page = this.selectPage(
                new Query<DaichushenshenqingEntity>(params).getPage(),
                new EntityWrapper<DaichushenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaichushenshenqingEntity> wrapper) {
		  Page<DaichushenshenqingView> page =new Query<DaichushenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaichushenshenqingVO> selectListVO(Wrapper<DaichushenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaichushenshenqingVO selectVO(Wrapper<DaichushenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaichushenshenqingView> selectListView(Wrapper<DaichushenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaichushenshenqingView selectView(Wrapper<DaichushenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
