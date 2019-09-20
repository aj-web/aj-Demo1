package org.lanqiao.entity;

import java.sql.Date;

public class Priv {
	private int pid;
	private String pclass;
	private String purl;
	private String name;
	private int state;
	
	private String by001;
	private String by002;
	private int by003;
	private Date by004;
	private Date creattime;
	private String creatuser;
	private Date updatetime;
	private String updateuser;
	
	public Priv() {
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPclass() {
		return pclass;
	}
	public void setPclass(String pclass) {
		this.pclass = pclass;
	}
	public String getPurl() {
		return purl;
	}
	public void setPurl(String purl) {
		this.purl = purl;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
}
