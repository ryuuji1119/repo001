package com.example.dbaccess.bean;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String Last_name;
	private String email;
	private String phone;
	private String hire_date;
	private String job_id;
	private Integer salary;
	private double commission;
	private double managerId;
	private double departmentId;
	
	public Employee() {}
	public Employee(String name, String last_name, String email, String phone, String hire_date, String job_id,Integer salary, double commission, double managerId, double departmentId) {
	super();
	this.name=name;
	this.Last_name=last_name;
	this.email=email;
	this.phone=phone;
	this.hire_date=hire_date;
	this.job_id=job_id;
	this.salary=salary;
	this.commission=commission;
	this.departmentId=departmentId;
	this.managerId=managerId;
}
	
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getManagerId() {
		return managerId;
	}
	public void setManagerId(double managerId) {
		this.managerId = managerId;
	}
	public double getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(double departmentId) {
		this.departmentId = departmentId;
	}
	public static Employee create(int id, String name, String last_name, String email, String phone, String hire_date, String job_id, Integer salary, double commission, double managerId, double departmentId) {
		Employee newEmployee = new Employee();
		newEmployee.setId(id);
		newEmployee.setName(name);
		newEmployee.setLast_name(last_name);
		newEmployee.setEmail(email);
		newEmployee.setPhone(phone);
		newEmployee.setJob_id(job_id);
		newEmployee.setSalary(salary);
		newEmployee.setCommission(commission);
		newEmployee.setManagerId(managerId);
		newEmployee.setDepartmentId(departmentId);
		return newEmployee;
}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary2) {
		this.salary = salary2;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Last_name == null) ? 0 : Last_name.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Last_name == null) {
			if (other.Last_name != null)
				return false;
		} else if (!Last_name.equals(other.Last_name))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", Last_name=");
		builder.append(Last_name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", hire_date=");
		builder.append(hire_date);
		builder.append(", job_id=");
		builder.append(job_id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", commission=");
		builder.append(commission);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append(", departmentId=");
		builder.append(departmentId);
		builder.append("]");
		return builder.toString();
	}
	


	

}