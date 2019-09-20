package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Admin;
import org.lanqiao.entity.Priv;
import org.lanqiao.entity.Role;

public interface AdminService {
	/**
	 * 判断返回的对象是否存在，即管理员是否存在，存在就赋予权限，并返回
	 * @param admin
	 * @return
	 */
	Admin checkUsernameAndPwd(Admin admin);
	/** 
	 *判断更改密码是否成功
	 *
	 */
	boolean updatePwdByacname(Admin admin);
	/**
	 * 判断更改个人信息是否成功
	 */
	boolean updateAdminInfo(Admin admin);
	/**
	 * 查找用户除权限以外的信息
	 * @param rid
	 * @return
	 */
	List<Priv> showAdminBaseInfo(int rid);
	/**
	 * 查找用户的权限
	 * @param rid
	 * @return
	 */
	Admin showAdminPrivs(int rid);
	/**
	 * 获取管理员消息，和该管理员的角色
	 * @return
	 */
	List<Admin> getAllRoles();
	/**
	 * 获取管理员的信息，和该管理员的权利
	 * @return
	 */
	List<Admin> getAllPrivs();
	/**
	 * 删除用户的角色和用户
	 * @return
	 */
	boolean deleteAdmin(int id);
	/**
	 * 查询管理员所有权利
	 * @return
	 */
	List<Priv> selectAllAdminPrivs();
	/**
	 * 输入rid查找用户的角色
	 * @param rid
	 * @return
	 */
	List<Role> selectAllAdminRoles(int rid);
	/**
	 * 查找所有管理员角色
	 * @param rid
	 * @return
	 */
	List<Role> selectAllAdminRoles();
	/**
	 * 输入用户的id，查找用户的基本信息
	 * @param id
	 * @return
	 */
	Admin showAdInfo(int id);
	/**
	 * 更新用户信息，1.更新名字2.删除权利3.赋予权力
	 * @param admin
	 * @return
	 */
	boolean UpdateAdmininfo(Admin admin);
	/**
	 * 插入用户并赋予角色
	 * @param role
	 * @return
	 */
	boolean addRole(Admin admin);
	/**
	 * 设置默认密码
	 * @param id
	 * @return
	 */
	int setDfPwd(int id);
	/**
	 * 通过下拉列表传入的pid查询对应的admin集合，集合中只有admin的基本信息,通过遍历传入aid查询角色
	 * @param pid
	 * @return
	 */
	List<Admin> findAdmin(int pid);
}
