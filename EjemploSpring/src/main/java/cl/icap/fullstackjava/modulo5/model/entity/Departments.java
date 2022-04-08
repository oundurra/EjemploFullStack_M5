package cl.icap.fullstackjava.modulo5.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departments {
	@Id
	private String dept_no;

	@Column(name = "dept_name")
	private String deptname;
	
	public Departments() {
	}
		

	public Departments(String dept_no, String dept_name) {
		this.dept_no = dept_no;
		this.deptname = dept_name;
	}

	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getDept_name() {
		return deptname;
	}

	public void setDept_name(String dept_name) {
		this.deptname = dept_name;
	}
	
}
