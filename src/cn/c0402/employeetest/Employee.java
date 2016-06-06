package cn.c0402.employeetest;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
	//域的范例
	private String name;
	private double salary;
	private Date hireDay;
	
	//构造方法
	
	public Employee(String n,double s,int year,int month,int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
	}
	
	//方法
	public String getName(){
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}	
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		salary += raise;
	}
}
