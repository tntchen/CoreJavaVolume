package cn.c0504_7.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
	private double salary;
	private Date hireDay;
	
	public Employee(String name,double salary,int year,int month,int day) {
		super(name);
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}
