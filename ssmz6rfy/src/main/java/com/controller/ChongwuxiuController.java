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

import com.entity.ChongwuxiuEntity;
import com.entity.view.ChongwuxiuView;

import com.service.ChongwuxiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宠物秀
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@RestController
@RequestMapping("/chongwuxiu")
public class ChongwuxiuController {
    @Autowired
    private ChongwuxiuService chongwuxiuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuxiuEntity chongwuxiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shouyangren")) {
			chongwuxiu.setShouyanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwuxiuEntity> ew = new EntityWrapper<ChongwuxiuEntity>();
		PageUtils page = chongwuxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuxiu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuxiuEntity chongwuxiu, HttpServletRequest request){
        EntityWrapper<ChongwuxiuEntity> ew = new EntityWrapper<ChongwuxiuEntity>();
		PageUtils page = chongwuxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuxiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuxiuEntity chongwuxiu){
       	EntityWrapper<ChongwuxiuEntity> ew = new EntityWrapper<ChongwuxiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuxiu, "chongwuxiu")); 
        return R.ok().put("data", chongwuxiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuxiuEntity chongwuxiu){
        EntityWrapper< ChongwuxiuEntity> ew = new EntityWrapper< ChongwuxiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuxiu, "chongwuxiu")); 
		ChongwuxiuView chongwuxiuView =  chongwuxiuService.selectView(ew);
		return R.ok("查询宠物秀成功").put("data", chongwuxiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuxiuEntity chongwuxiu = chongwuxiuService.selectById(id);
		chongwuxiu.setClicktime(new Date());
		chongwuxiuService.updateById(chongwuxiu);
        return R.ok().put("data", chongwuxiu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuxiuEntity chongwuxiu = chongwuxiuService.selectById(id);
		chongwuxiu.setClicktime(new Date());
		chongwuxiuService.updateById(chongwuxiu);
        return R.ok().put("data", chongwuxiu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ChongwuxiuEntity chongwuxiu = chongwuxiuService.selectById(id);
        if(type.equals("1")) {
        	chongwuxiu.setThumbsupnum(chongwuxiu.getThumbsupnum()+1);
        } else {
        	chongwuxiu.setCrazilynum(chongwuxiu.getCrazilynum()+1);
        }
        chongwuxiuService.updateById(chongwuxiu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuxiuEntity chongwuxiu, HttpServletRequest request){
    	chongwuxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuxiu);

        chongwuxiuService.insert(chongwuxiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuxiuEntity chongwuxiu, HttpServletRequest request){
    	chongwuxiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuxiu);

        chongwuxiuService.insert(chongwuxiu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwuxiuEntity chongwuxiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuxiu);
        chongwuxiuService.updateById(chongwuxiu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuxiuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChongwuxiuEntity> wrapper = new EntityWrapper<ChongwuxiuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shouyangren")) {
			wrapper.eq("shouyanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = chongwuxiuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwuxiuEntity chongwuxiu, HttpServletRequest request,String pre){
        EntityWrapper<ChongwuxiuEntity> ew = new EntityWrapper<ChongwuxiuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        
        params.put("order", "desc");
		PageUtils page = chongwuxiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuxiu), params), params));
        return R.ok().put("data", page);
    }


}
