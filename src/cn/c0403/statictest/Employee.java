package cn.c0403.statictest;

class Employee {
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	//构造方法
	public Employee() {
		super();
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = 0;
	}
	//set/get方法
	public static int getNextId() {
		return nextId;//返回静态域
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		id = nextId;//设置id的值为递增的下个nexid
		nextId++;
	}
	
	public static void main(String[] args) {
		Employee  e = new Employee("Harry",5000);
		System.out.println(e.getName() + " " + e.getSalary());
	}	
}
