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


import com.dao.ShouyangrenDao;
import com.entity.ShouyangrenEntity;
import com.service.ShouyangrenService;
import com.entity.vo.ShouyangrenVO;
import com.entity.view.ShouyangrenView;

@Service("shouyangrenService")
public class ShouyangrenServiceImpl extends ServiceImpl<ShouyangrenDao, ShouyangrenEntity> implements ShouyangrenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouyangrenEntity> page = this.selectPage(
                new Query<ShouyangrenEntity>(params).getPage(),
                new EntityWrapper<ShouyangrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouyangrenEntity> wrapper) {
		  Page<ShouyangrenView> page =new Query<ShouyangrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouyangrenVO> selectListVO(Wrapper<ShouyangrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouyangrenVO selectVO(Wrapper<ShouyangrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouyangrenView> selectListView(Wrapper<ShouyangrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouyangrenView selectView(Wrapper<ShouyangrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
