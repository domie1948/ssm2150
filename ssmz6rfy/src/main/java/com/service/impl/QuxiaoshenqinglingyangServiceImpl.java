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


import com.dao.QuxiaoshenqinglingyangDao;
import com.entity.QuxiaoshenqinglingyangEntity;
import com.service.QuxiaoshenqinglingyangService;
import com.entity.vo.QuxiaoshenqinglingyangVO;
import com.entity.view.QuxiaoshenqinglingyangView;

@Service("quxiaoshenqinglingyangService")
public class QuxiaoshenqinglingyangServiceImpl extends ServiceImpl<QuxiaoshenqinglingyangDao, QuxiaoshenqinglingyangEntity> implements QuxiaoshenqinglingyangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoshenqinglingyangEntity> page = this.selectPage(
                new Query<QuxiaoshenqinglingyangEntity>(params).getPage(),
                new EntityWrapper<QuxiaoshenqinglingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaoshenqinglingyangEntity> wrapper) {
		  Page<QuxiaoshenqinglingyangView> page =new Query<QuxiaoshenqinglingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaoshenqinglingyangVO> selectListVO(Wrapper<QuxiaoshenqinglingyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoshenqinglingyangVO selectVO(Wrapper<QuxiaoshenqinglingyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoshenqinglingyangView> selectListView(Wrapper<QuxiaoshenqinglingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoshenqinglingyangView selectView(Wrapper<QuxiaoshenqinglingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
