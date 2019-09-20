package org.lanqiao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.lanqiao.entity.Admin;
import org.lanqiao.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
		
	@RequestMapping("/login")
	public String login(Admin admin,String valicode,HttpSession session,HttpServletRequest request) {
		Logger logger=Logger.getLogger("log4j.properties");
		Admin admin1=adminService.checkUsernameAndPwd(new Admin(admin.getAcname(),Hashing.md5().hashString(admin.getApwd(), Charsets.UTF_8).toString()));
		if(admin1==null) {	
			logger.info("登录失败");
			request.getSession().setAttribute("erroMsg", "用户名或密码错误");		
			return "redirect:login.jsp";
		}else {
			logger.info("登录成功");
			request.getSession().setAttribute("Admin",admin1);
			return "index";
		}
	}
}
