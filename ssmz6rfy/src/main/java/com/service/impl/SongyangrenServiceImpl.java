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


import com.dao.SongyangrenDao;
import com.entity.SongyangrenEntity;
import com.service.SongyangrenService;
import com.entity.vo.SongyangrenVO;
import com.entity.view.SongyangrenView;

@Service("songyangrenService")
public class SongyangrenServiceImpl extends ServiceImpl<SongyangrenDao, SongyangrenEntity> implements SongyangrenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SongyangrenEntity> page = this.selectPage(
                new Query<SongyangrenEntity>(params).getPage(),
                new EntityWrapper<SongyangrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SongyangrenEntity> wrapper) {
		  Page<SongyangrenView> page =new Query<SongyangrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SongyangrenVO> selectListVO(Wrapper<SongyangrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SongyangrenVO selectVO(Wrapper<SongyangrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SongyangrenView> selectListView(Wrapper<SongyangrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SongyangrenView selectView(Wrapper<SongyangrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
