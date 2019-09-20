package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Priv;
import org.lanqiao.entity.Role;

public interface RoleService {
	/**
	 * 获取所有角色信息
	 * @return
	 */
	List<Role> getAllRoles();
	/**
	 * 获取所有权限
	 * @return
	 */
	List<Priv> getAllPrivs();
	/**
	 * 插入角色并赋予权限
	 * @param role
	 * @return
	 */
	boolean addRole(Role role);
	/**
	 * 删除角色和权限
	 * @param rid
	 * @return
	 */
	boolean deleteRole(int rid);
	/**
	 * 修改角色和权利
	 * @param rid
	 * @return
	 */
	boolean UpdateRoleAndPrivs(Role role);
	/**
	 * 获取用户用于修改
	 * @param rid
	 * @return
	 */
	Role getRoleById(int rid);
	/**
	 * 修改功能，获取权利的集合
	 * @param role
	 * @return
	 */
	Role getPrivByRole(Role role);
}
