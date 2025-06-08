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


import com.dao.SongyangchongwuDao;
import com.entity.SongyangchongwuEntity;
import com.service.SongyangchongwuService;
import com.entity.vo.SongyangchongwuVO;
import com.entity.view.SongyangchongwuView;

@Service("songyangchongwuService")
public class SongyangchongwuServiceImpl extends ServiceImpl<SongyangchongwuDao, SongyangchongwuEntity> implements SongyangchongwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SongyangchongwuEntity> page = this.selectPage(
                new Query<SongyangchongwuEntity>(params).getPage(),
                new EntityWrapper<SongyangchongwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SongyangchongwuEntity> wrapper) {
		  Page<SongyangchongwuView> page =new Query<SongyangchongwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SongyangchongwuVO> selectListVO(Wrapper<SongyangchongwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SongyangchongwuVO selectVO(Wrapper<SongyangchongwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SongyangchongwuView> selectListView(Wrapper<SongyangchongwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SongyangchongwuView selectView(Wrapper<SongyangchongwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
