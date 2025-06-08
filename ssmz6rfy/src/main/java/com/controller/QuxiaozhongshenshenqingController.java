package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QuxiaozhongshenshenqingEntity;
import com.entity.view.QuxiaozhongshenshenqingView;

import com.service.QuxiaozhongshenshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 取消终审申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@RestController
@RequestMapping("/quxiaozhongshenshenqing")
public class QuxiaozhongshenshenqingController {
    @Autowired
    private QuxiaozhongshenshenqingService quxiaozhongshenshenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("songyangren")) {
			quxiaozhongshenshenqing.setSongyanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shouyangren")) {
			quxiaozhongshenshenqing.setShouyanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaozhongshenshenqingEntity> ew = new EntityWrapper<QuxiaozhongshenshenqingEntity>();
		PageUtils page = quxiaozhongshenshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaozhongshenshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing, HttpServletRequest request){
        EntityWrapper<QuxiaozhongshenshenqingEntity> ew = new EntityWrapper<QuxiaozhongshenshenqingEntity>();
		PageUtils page = quxiaozhongshenshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaozhongshenshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing){
       	EntityWrapper<QuxiaozhongshenshenqingEntity> ew = new EntityWrapper<QuxiaozhongshenshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaozhongshenshenqing, "quxiaozhongshenshenqing")); 
        return R.ok().put("data", quxiaozhongshenshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing){
        EntityWrapper< QuxiaozhongshenshenqingEntity> ew = new EntityWrapper< QuxiaozhongshenshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaozhongshenshenqing, "quxiaozhongshenshenqing")); 
		QuxiaozhongshenshenqingView quxiaozhongshenshenqingView =  quxiaozhongshenshenqingService.selectView(ew);
		return R.ok("查询取消终审申请成功").put("data", quxiaozhongshenshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing = quxiaozhongshenshenqingService.selectById(id);
        return R.ok().put("data", quxiaozhongshenshenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing = quxiaozhongshenshenqingService.selectById(id);
        return R.ok().put("data", quxiaozhongshenshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing, HttpServletRequest request){
    	quxiaozhongshenshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaozhongshenshenqing);

        quxiaozhongshenshenqingService.insert(quxiaozhongshenshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing, HttpServletRequest request){
    	quxiaozhongshenshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaozhongshenshenqing);

        quxiaozhongshenshenqingService.insert(quxiaozhongshenshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuxiaozhongshenshenqingEntity quxiaozhongshenshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaozhongshenshenqing);
        quxiaozhongshenshenqingService.updateById(quxiaozhongshenshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaozhongshenshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QuxiaozhongshenshenqingEntity> wrapper = new EntityWrapper<QuxiaozhongshenshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("songyangren")) {
			wrapper.eq("songyanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shouyangren")) {
			wrapper.eq("shouyanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = quxiaozhongshenshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
