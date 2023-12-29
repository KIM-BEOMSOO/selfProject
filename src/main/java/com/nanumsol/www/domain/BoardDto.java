package com.nanumsol.www.domain;

public class BoardDto {
	private String emp_no; //사원번호
	private String ename_kr; //이름(한글)
	private String emp_rrno; //주민등록번호
	private String emp_rrno_F; //주민등록번호 앞자리
	private String emp_rrno_B; //주민등록번호 뒷자리
	private String join_date; //가입일
	
	@Override
	public String toString() {
		return "BoardDto [emp_no=" + emp_no + ", ename_kr=" + ename_kr + ", emp_rrno=" + emp_rrno + ", emp_rrno_F="
				+ emp_rrno_F + ", emp_rrno_B=" + emp_rrno_B + ", join_date=" + join_date + "]";
	}
	
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getEname_kr() {
		return ename_kr;
	}
	public void setEname_kr(String ename_kr) {
		this.ename_kr = ename_kr;
	}
	public String getEmp_rrno() {
		return emp_rrno;
	}
	public void setEmp_rrno(String emp_rrno) {
		this.emp_rrno = emp_rrno;
	}
	public String getEmp_rrno_F() {
		return emp_rrno_F;
	}
	public void setEmp_rrno_F(String emp_rrno_F) {
		this.emp_rrno_F = emp_rrno_F;
	}
	public String getEmp_rrno_B() {
		return emp_rrno_B;
	}
	public void setEmp_rrno_B(String emp_rrno_B) {
		this.emp_rrno_B = emp_rrno_B;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	
	
	
	
}