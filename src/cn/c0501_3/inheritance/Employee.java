package cn.c0501_3.inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		GregorianCalendar canlendar = new GregorianCalendar(year,month-1,day);
		this.hireDay = canlendar.getTime();
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
}
