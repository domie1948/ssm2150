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


import com.dao.ChongwuxiuDao;
import com.entity.ChongwuxiuEntity;
import com.service.ChongwuxiuService;
import com.entity.vo.ChongwuxiuVO;
import com.entity.view.ChongwuxiuView;

@Service("chongwuxiuService")
public class ChongwuxiuServiceImpl extends ServiceImpl<ChongwuxiuDao, ChongwuxiuEntity> implements ChongwuxiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuxiuEntity> page = this.selectPage(
                new Query<ChongwuxiuEntity>(params).getPage(),
                new EntityWrapper<ChongwuxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuxiuEntity> wrapper) {
		  Page<ChongwuxiuView> page =new Query<ChongwuxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuxiuVO> selectListVO(Wrapper<ChongwuxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuxiuVO selectVO(Wrapper<ChongwuxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuxiuView> selectListView(Wrapper<ChongwuxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuxiuView selectView(Wrapper<ChongwuxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
