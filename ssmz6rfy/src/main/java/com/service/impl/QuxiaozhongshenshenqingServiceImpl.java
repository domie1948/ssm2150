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


import com.dao.QuxiaozhongshenshenqingDao;
import com.entity.QuxiaozhongshenshenqingEntity;
import com.service.QuxiaozhongshenshenqingService;
import com.entity.vo.QuxiaozhongshenshenqingVO;
import com.entity.view.QuxiaozhongshenshenqingView;

@Service("quxiaozhongshenshenqingService")
public class QuxiaozhongshenshenqingServiceImpl extends ServiceImpl<QuxiaozhongshenshenqingDao, QuxiaozhongshenshenqingEntity> implements QuxiaozhongshenshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaozhongshenshenqingEntity> page = this.selectPage(
                new Query<QuxiaozhongshenshenqingEntity>(params).getPage(),
                new EntityWrapper<QuxiaozhongshenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaozhongshenshenqingEntity> wrapper) {
		  Page<QuxiaozhongshenshenqingView> page =new Query<QuxiaozhongshenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaozhongshenshenqingVO> selectListVO(Wrapper<QuxiaozhongshenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaozhongshenshenqingVO selectVO(Wrapper<QuxiaozhongshenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaozhongshenshenqingView> selectListView(Wrapper<QuxiaozhongshenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaozhongshenshenqingView selectView(Wrapper<QuxiaozhongshenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
