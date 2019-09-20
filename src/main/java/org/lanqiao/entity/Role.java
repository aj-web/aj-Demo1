package org.lanqiao.entity;

import java.sql.Date;
import java.util.List;

public class Role {
	private int rid;
	private String rname;
	
	private String by001;
	private String by002;
	private int by003;
	private Date by004;
	private String creatuser;
	private Date creattime;
	private String updateuser;
	private Date updatetime;
	private List<Priv> lp;
	
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
	
	public Role() {
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
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

	public String getCreatuser() {
		return creatuser;
	}

	public void setCreatuser(String creatuser) {
		this.creatuser = creatuser;
	}

	public Date getCreattime() {
		return creattime;
	}

	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public List<Priv> getLp() {
		return lp;
	}

	public void setLp(List<Priv> lp) {
		this.lp = lp;
	}
	
	
}
