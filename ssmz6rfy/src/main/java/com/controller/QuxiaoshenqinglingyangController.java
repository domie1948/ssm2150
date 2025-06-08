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

import com.entity.QuxiaoshenqinglingyangEntity;
import com.entity.view.QuxiaoshenqinglingyangView;

import com.service.QuxiaoshenqinglingyangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 取消申请领养
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@RestController
@RequestMapping("/quxiaoshenqinglingyang")
public class QuxiaoshenqinglingyangController {
    @Autowired
    private QuxiaoshenqinglingyangService quxiaoshenqinglingyangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("songyangren")) {
			quxiaoshenqinglingyang.setSongyanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shouyangren")) {
			quxiaoshenqinglingyang.setShouyanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuxiaoshenqinglingyangEntity> ew = new EntityWrapper<QuxiaoshenqinglingyangEntity>();
		PageUtils page = quxiaoshenqinglingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshenqinglingyang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang, HttpServletRequest request){
        EntityWrapper<QuxiaoshenqinglingyangEntity> ew = new EntityWrapper<QuxiaoshenqinglingyangEntity>();
		PageUtils page = quxiaoshenqinglingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshenqinglingyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang){
       	EntityWrapper<QuxiaoshenqinglingyangEntity> ew = new EntityWrapper<QuxiaoshenqinglingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaoshenqinglingyang, "quxiaoshenqinglingyang")); 
        return R.ok().put("data", quxiaoshenqinglingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang){
        EntityWrapper< QuxiaoshenqinglingyangEntity> ew = new EntityWrapper< QuxiaoshenqinglingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaoshenqinglingyang, "quxiaoshenqinglingyang")); 
		QuxiaoshenqinglingyangView quxiaoshenqinglingyangView =  quxiaoshenqinglingyangService.selectView(ew);
		return R.ok("查询取消申请领养成功").put("data", quxiaoshenqinglingyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang = quxiaoshenqinglingyangService.selectById(id);
        return R.ok().put("data", quxiaoshenqinglingyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang = quxiaoshenqinglingyangService.selectById(id);
        return R.ok().put("data", quxiaoshenqinglingyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang, HttpServletRequest request){
    	quxiaoshenqinglingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaoshenqinglingyang);

        quxiaoshenqinglingyangService.insert(quxiaoshenqinglingyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang, HttpServletRequest request){
    	quxiaoshenqinglingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quxiaoshenqinglingyang);

        quxiaoshenqinglingyangService.insert(quxiaoshenqinglingyang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuxiaoshenqinglingyangEntity quxiaoshenqinglingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshenqinglingyang);
        quxiaoshenqinglingyangService.updateById(quxiaoshenqinglingyang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quxiaoshenqinglingyangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QuxiaoshenqinglingyangEntity> wrapper = new EntityWrapper<QuxiaoshenqinglingyangEntity>();
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

		int count = quxiaoshenqinglingyangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
