package cn.c0508_10.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject) {
		//快速测试对象是否相等
		if(this == otherObject) return true;
		//如果参数为空返回错误
		if(otherObject == null) return false;
		//如果类不同不相等,判断两个对象是否是通过同一个.class文件完成的对象创建
		if(getClass() != otherObject.getClass()) return false;
		//otherObject是一个空的Employee类型
		Employee other = (Employee) otherObject;
		//如果域内有相等值就测试
		return Objects.equals(name,other.name) && salary == other.salary &&
				Objects.equals(hireDay,other.hireDay);
	}
	
	public int hashCode() {
		return Objects.hash(name,salary,hireDay);
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + 
				",hireDay=" + hireDay + "]";
	}
}
