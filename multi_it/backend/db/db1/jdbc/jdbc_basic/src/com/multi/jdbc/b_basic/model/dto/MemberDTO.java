package com.multi.jdbc.b_basic.model.dto;

import java.sql.Date;

public class MemberDTO {

	private int id;
	private String pw;
	private String name;
	private String tel;
	private Date createdate; // sql date
	
	public MemberDTO() {
	}
	
	public MemberDTO(int id, String pw, String name, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
	public MemberDTO(int id, String pw, String name, String tel, Date createdate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.createdate = createdate;
	}
	
	public Date getCreatedate() {
		return createdate;
	}
	
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "MemberDTO{" +
				"id=" + id +
				", pw='" + pw + '\'' +
				", name='" + name + '\'' +
				", tel='" + tel + '\'' +
				", createdate=" + createdate +
				'}';
	}
	
	



}
