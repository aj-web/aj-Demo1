package org.lanqiao.mapper;

import java.util.List;

import org.lanqiao.entity.Priv;
import org.lanqiao.entity.Role;

public interface PrivMapper {
	/**
	 * 通过管理员帐号查询菜单权利
	 * @param aid
	 * @return
	 */
	public List<Priv> getPrivByAid(int aid);
	/**
	 * 通过角色ID查询所有权限
	 * @param rid
	 * @return
	 */
	public List<Priv> getPrivByRid(int rid);
	/**
	 * 无脑查询所有权限
	 * @return
	 */
	public List<Priv> getAllPriv();
	/**
	 * 查找用户的所有权限,用来用与修改功能选中复选框
	 * @param role
	 * @return
	 */
	List<Priv> findPrivByRole(Role role);
}
