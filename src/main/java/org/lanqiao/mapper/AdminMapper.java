package org.lanqiao.mapper;

import java.util.List;

import org.lanqiao.entity.Admin;
import org.lanqiao.entity.Priv;
import org.lanqiao.entity.Role;

public interface AdminMapper {
	/**
	 * 
	 * 通过管理员帐号和密码查询管理员,并通过Mybatis查找管理员的priv集合和role集合
	 * @param admin
	 * @return
	 */
	Admin selectAdminByAcnameAndApwd(Admin admin);
	/**
	 * 修改密码
	 */
	int updatePwdByAcname(Admin admin);
	/**
	 * 1.修改管理员信息
	 * 
	 */
	int updateAdminInfo(Admin admin);
	/**
	 * 管理员模块，查找用户的权限，输入用户的rid
	 * @return
	 */
	List<Priv> selectAllAdminPrivs(int rid);
	/**
	 * 管理员模块,通过rid 查找用户除权限以外的信息
	 * @param rid
	 * @return
	 */
	Admin selectAdminInfo(int rid);
	/**
	 * 管理员模块，无脑查询所有管理员权利
	 * @return
	 */
	List<Priv> selectAllAdminPrivs();
	/**
	 * 查询管理员的角色,获取ID和名字
	 */
	List<Role> searchAdminByAid(int id);
	/**
	 * 管理员模块,查找所有的admin的信息，除了权限
	 * @return
	 */
	List<Admin> selectAllAdminInfo();
	/**
	 * 管理员模块，查找用户的角色，输入用户的rid
	 * @return
	 */
	List<Role> selectAllAdminRole(int rid);
	/**
	 * 删除用户的权利
	 * @param role
	 * @return
	 */
	int deleteAdminPrivs(int id);
	/**
	 * 删除用户
	 * @param role
	 * @return
	 */
	int deleteAdmin(int id);
	/**
	 * 管理员模块，无脑查询所有管理员角色
	 * @return
	 */
	List<Role> selectAllAdminRoles();
	/**
	 * 输入用户的id查找用户的信息
	 * @param id
	 * @return
	 */
	Admin showAdminInfo(int id);
	/**
	 * 2.通过id，删除用户角色  
	 * @param id
	 * @return
	 */
	int deleteAdminRole(int aid);
	/**
	 * 3.更新管用户角色
	 * @param admin
	 * @return
	 */
	int insertAdminRole(Admin admin); 
	/**
	 * 插入Admin
	 * @param admin
	 * @return
	 */
	int insertAdmin(Admin admin);
	/**
	 * 为插入的Admin赋予角色
	 * @param admin
	 * @return
	 */
	int insertAdminRoles(Admin admin);
	/**
	 * 重置密码
	 * @param id
	 * @return
	 */
	int setDfPwd(int id);
	/**
	 * 通过下拉列表传入的pid查询对应的admin集合，集合中只有admin的基本信息
	 * @param pid
	 * @return
	 */
	List<Admin> findAdmin(int pid);
	
}	
