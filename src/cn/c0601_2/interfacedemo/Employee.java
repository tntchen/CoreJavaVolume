package cn.c0601_2.interfacedemo;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary (double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	//记住此处Comparable接口的使用,排序
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
}
