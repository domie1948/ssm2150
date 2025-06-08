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

import com.entity.LingyangchenggongEntity;
import com.entity.view.LingyangchenggongView;

import com.service.LingyangchenggongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 领养成功
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@RestController
@RequestMapping("/lingyangchenggong")
public class LingyangchenggongController {
    @Autowired
    private LingyangchenggongService lingyangchenggongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingyangchenggongEntity lingyangchenggong, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("songyangren")) {
			lingyangchenggong.setSongyanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shouyangren")) {
			lingyangchenggong.setShouyanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LingyangchenggongEntity> ew = new EntityWrapper<LingyangchenggongEntity>();
		PageUtils page = lingyangchenggongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangchenggong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingyangchenggongEntity lingyangchenggong, HttpServletRequest request){
        EntityWrapper<LingyangchenggongEntity> ew = new EntityWrapper<LingyangchenggongEntity>();
		PageUtils page = lingyangchenggongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangchenggong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingyangchenggongEntity lingyangchenggong){
       	EntityWrapper<LingyangchenggongEntity> ew = new EntityWrapper<LingyangchenggongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingyangchenggong, "lingyangchenggong")); 
        return R.ok().put("data", lingyangchenggongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingyangchenggongEntity lingyangchenggong){
        EntityWrapper< LingyangchenggongEntity> ew = new EntityWrapper< LingyangchenggongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingyangchenggong, "lingyangchenggong")); 
		LingyangchenggongView lingyangchenggongView =  lingyangchenggongService.selectView(ew);
		return R.ok("查询领养成功成功").put("data", lingyangchenggongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingyangchenggongEntity lingyangchenggong = lingyangchenggongService.selectById(id);
        return R.ok().put("data", lingyangchenggong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingyangchenggongEntity lingyangchenggong = lingyangchenggongService.selectById(id);
        return R.ok().put("data", lingyangchenggong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingyangchenggongEntity lingyangchenggong, HttpServletRequest request){
    	lingyangchenggong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangchenggong);

        lingyangchenggongService.insert(lingyangchenggong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingyangchenggongEntity lingyangchenggong, HttpServletRequest request){
    	lingyangchenggong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangchenggong);

        lingyangchenggongService.insert(lingyangchenggong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LingyangchenggongEntity lingyangchenggong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingyangchenggong);
        lingyangchenggongService.updateById(lingyangchenggong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingyangchenggongService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LingyangchenggongEntity> wrapper = new EntityWrapper<LingyangchenggongEntity>();
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

		int count = lingyangchenggongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
