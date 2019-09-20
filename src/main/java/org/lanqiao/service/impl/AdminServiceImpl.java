package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Admin;
import org.lanqiao.entity.Priv;
import org.lanqiao.entity.Role;
import org.lanqiao.mapper.AdminMapper;
import org.lanqiao.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	public Admin checkUsernameAndPwd(Admin admin) {
		Admin ad=adminMapper.selectAdminByAcnameAndApwd(admin);
		return ad;
	}

	public boolean updatePwdByacname(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAdminInfo(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Priv> showAdminBaseInfo(int rid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Admin showAdminPrivs(int rid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Admin> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Admin> getAllPrivs() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAdmin(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Priv> selectAllAdminPrivs() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> selectAllAdminRoles(int rid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> selectAllAdminRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Admin showAdInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean UpdateAdmininfo(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addRole(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public int setDfPwd(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Admin> findAdmin(int pid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
