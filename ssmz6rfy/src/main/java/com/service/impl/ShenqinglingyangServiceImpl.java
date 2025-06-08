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


import com.dao.ShenqinglingyangDao;
import com.entity.ShenqinglingyangEntity;
import com.service.ShenqinglingyangService;
import com.entity.vo.ShenqinglingyangVO;
import com.entity.view.ShenqinglingyangView;

@Service("shenqinglingyangService")
public class ShenqinglingyangServiceImpl extends ServiceImpl<ShenqinglingyangDao, ShenqinglingyangEntity> implements ShenqinglingyangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqinglingyangEntity> page = this.selectPage(
                new Query<ShenqinglingyangEntity>(params).getPage(),
                new EntityWrapper<ShenqinglingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqinglingyangEntity> wrapper) {
		  Page<ShenqinglingyangView> page =new Query<ShenqinglingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqinglingyangVO> selectListVO(Wrapper<ShenqinglingyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqinglingyangVO selectVO(Wrapper<ShenqinglingyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqinglingyangView> selectListView(Wrapper<ShenqinglingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqinglingyangView selectView(Wrapper<ShenqinglingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
