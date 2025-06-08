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


import com.dao.QuxiaodaichushenshenqingDao;
import com.entity.QuxiaodaichushenshenqingEntity;
import com.service.QuxiaodaichushenshenqingService;
import com.entity.vo.QuxiaodaichushenshenqingVO;
import com.entity.view.QuxiaodaichushenshenqingView;

@Service("quxiaodaichushenshenqingService")
public class QuxiaodaichushenshenqingServiceImpl extends ServiceImpl<QuxiaodaichushenshenqingDao, QuxiaodaichushenshenqingEntity> implements QuxiaodaichushenshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaodaichushenshenqingEntity> page = this.selectPage(
                new Query<QuxiaodaichushenshenqingEntity>(params).getPage(),
                new EntityWrapper<QuxiaodaichushenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaodaichushenshenqingEntity> wrapper) {
		  Page<QuxiaodaichushenshenqingView> page =new Query<QuxiaodaichushenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaodaichushenshenqingVO> selectListVO(Wrapper<QuxiaodaichushenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaodaichushenshenqingVO selectVO(Wrapper<QuxiaodaichushenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaodaichushenshenqingView> selectListView(Wrapper<QuxiaodaichushenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaodaichushenshenqingView selectView(Wrapper<QuxiaodaichushenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
