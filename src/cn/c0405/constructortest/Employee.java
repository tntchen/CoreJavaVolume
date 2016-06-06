package cn.c0405.constructortest;

import java.util.Random;

class Employee {
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	//静态初始化代码块
	static {
		Random generator = new Random();
		//设置nextid为0~9999的随机数
		nextId = generator.nextInt(10000);
	}
	
	//对象初始化代码块
	{
		id = nextId;
		nextId++;
	}
	
	//三个覆盖结构
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double s) {
		this("Employee #" + nextId,s);
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}		
}
