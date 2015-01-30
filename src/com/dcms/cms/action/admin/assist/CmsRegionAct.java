package com.dcms.cms.action.admin.assist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dcms.cms.entity.assist.CmsRegion;
import com.dcms.cms.entity.main.CmsUser;
import com.dcms.cms.manager.assist.CmsRegionMng;
import com.dcms.cms.web.CmsUtils;

@Controller
public class CmsRegionAct {
	/**
	 * 获取下级地区
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/region/v_child.do")
	public String add(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {

		List<CmsRegion> regions = new ArrayList<CmsRegion>();

		if (id != null) {
			if(id != 0){
				
				//根据当前等级获取下一等级
				regions = manager.getRegionsByParentId(id);
				
			}else{
				
				//如果ID为0,那么返回所有省份
				regions = manager.getProvince();
			}
		}
		model.addAttribute("dataList", regions);
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/json;charset=UTF-8");
		return "common/list_option";
	}

	@Autowired
	private CmsRegionMng manager;
}
