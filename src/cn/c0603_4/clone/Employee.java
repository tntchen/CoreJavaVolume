package cn.c0603_4.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		hireDay = new Date();
	}
	 public Employee clone() throws CloneNotSupportedException {
		 //声明Object.clone()
		 Employee cloned = (Employee) super.clone();
		 
		 //clone方法域
		 cloned.hireDay = (Date) hireDay.clone();
		 
		 return cloned;
	 }
	
	 /*
	  * 设置薪水日为一个给定的日期
	  */
	 public void setHireDay(int year,int month,int day) {
		 Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
		 
		 //域变化的范例
		 hireDay.setTime(newHireDay.getTime());
	 }
	 
	 public void raiseSalary(double byPercent) {
		 double raise = salary * byPercent / 100;
		 salary += raise;
	 }
	 
	 public String toString() {
		 return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay +"]";
	 }
}
