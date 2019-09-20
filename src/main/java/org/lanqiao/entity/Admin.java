package org.lanqiao.entity;

import java.sql.Date;
import java.util.List;


public class Admin {
	private int id;
	private String aname;
	private String apwd;	
	private String acname;
	private String atel;
	private String aemail;
	private String aimg;
	private List<Priv> lp;//权限集合
	private List<Role> lr;//角色集合
	
	private String by001;
	private String by002;
	private int by003;
	private Date by004;
	private Date creattime;
	private String creatuser;
	private Date updatetime;
	private String updateuser;
	
	/**
	 * 通过el表达式直接获取admin的角色
	 * @return
	 */
	public String getRoles() {
		String a="";
		if(lr!=null) {
			for(int i=0;i<lr.size();i++) {
				if(i==lr.size()-1){
					a+=lr.get(i).getRname();
				}
					else{
						a+=lr.get(i).getRname()+",";
						}
			}
		}
		return a;
	}
	/**
	 * 通过el表达式直接获取admin的权利
	 * @return
	 */
	public String getPrivs() {
		String s="";
		if(lp!=null) {
			for(int i=0;i<lp.size();i++) {
				if(i==lp.size()-1) 
					s+=lp.get(i).getName();
					else 
						s+=lp.get(i).getName()+",";
			}
		}
		return s;
	}
	
	public Admin(int id, String aname, String atel, String aemail) {
		this.id = id;
		this.aname = aname;
		this.atel = atel;
		this.aemail = aemail;
	}

	/**
	 * 直接获取角色，通过EL表达式
	 * @return
	 */
	public String getlr_String() {
		String lr_String="";
		if(lr!=null) {
			for(int i=0;i<lr.size();i++) {
				if(i==lr.size()-1) 
					lr_String+=lr.get(i).getRname();
					else 
						lr_String+=lr.get(i).getRname()+"";
			}
		}
		return lr_String;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得管理员姓名
	 * @return
	 */
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	/**
	 * 获得管理员帐号
	 * @return
	 */
	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}
	/**
	 * 获得管理员密码
	 * @return
	 */
	public String getApwd() {
		return apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}

	public String getAtel() {
		return atel;
	}

	public void setAtel(String atel) {
		this.atel = atel;
	}

	public String getAemail() {
		return aemail;
	}

	public void setAemail(String aemail) {
		this.aemail = aemail;
	}

	public String getAimg() {
		return aimg;
	}

	public void setAimg(String aimg) {
		this.aimg = aimg;
	}

	public List<Priv> getLp() {
		return lp;
	}
	
	public void setLp(List<Priv> lp) {
		this.lp = lp;
	}
	
	public Admin() {
	}

	public Admin(String acname, String apwd) {
		this.acname=acname;
		this.apwd=apwd;
	}

	public Date getCreattime() {
		return creattime;
	}

	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}

	public String getCreatuser() {
		return creatuser;
	}

	public void setCreatuser(String creatuser) {
		this.creatuser = creatuser;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public String getBy001() {
		return by001;
	}

	public void setBy001(String by001) {
		this.by001 = by001;
	}

	public String getBy002() {
		return by002;
	}

	public void setBy002(String by002) {
		this.by002 = by002;
	}

	public int getBy003() {
		return by003;
	}

	public void setBy003(int by003) {
		this.by003 = by003;
	}

	public Date getBy004() {
		return by004;
	}

	public void setBy004(Date by004) {
		this.by004 = by004;
	}

	public List<Role> getLr() {
		return lr;
	}

	public void setLr(List<Role> lr) {
		this.lr = lr;
	}
	
	
}
