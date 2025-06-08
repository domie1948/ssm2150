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


import com.dao.DengzhongshenshenqingDao;
import com.entity.DengzhongshenshenqingEntity;
import com.service.DengzhongshenshenqingService;
import com.entity.vo.DengzhongshenshenqingVO;
import com.entity.view.DengzhongshenshenqingView;

@Service("dengzhongshenshenqingService")
public class DengzhongshenshenqingServiceImpl extends ServiceImpl<DengzhongshenshenqingDao, DengzhongshenshenqingEntity> implements DengzhongshenshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DengzhongshenshenqingEntity> page = this.selectPage(
                new Query<DengzhongshenshenqingEntity>(params).getPage(),
                new EntityWrapper<DengzhongshenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DengzhongshenshenqingEntity> wrapper) {
		  Page<DengzhongshenshenqingView> page =new Query<DengzhongshenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DengzhongshenshenqingVO> selectListVO(Wrapper<DengzhongshenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DengzhongshenshenqingVO selectVO(Wrapper<DengzhongshenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DengzhongshenshenqingView> selectListView(Wrapper<DengzhongshenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DengzhongshenshenqingView selectView(Wrapper<DengzhongshenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
