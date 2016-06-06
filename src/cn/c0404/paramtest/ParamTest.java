package cn.c0404.paramtest;

/*
 * 演示java中的参数传递
 */
public class ParamTest {
	public static void main(String[] args) {
		/*
		 * 测试1:方法不能修改数值参数
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before:percent=" + percent);
		tripleValue(percent);
		System.out.println("After:percent=" + percent);
		
		/*
		 * 测试2:方法可以改变对象变量的状态
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry",50000);
		System.out.println("Before:salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After:salary=" + harry.getSalary());
		
		/*
		 * 测试3:方法不能向对象变量附加新的对象
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice",70000);
		Employee b = new Employee("Bob",60000);
		System.out.println("Before:a=" + a.getName());
		System.out.println("Before:b=" + b.getName());
		swap(a, b);
		System.out.println("After:a=" + a.getName());
		System.out.println("After:b=" + b.getName());
	}
	
	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("End of method:x=" + x);
	}
	
	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
		System.out.println("End of method:salary=" + x.getSalary());
	}
	
	public static void swap(Employee x,Employee y) {
		Employee  temp = x;
		x = y;
		y = temp;
		System.out.println("End of method:x=" + x.getName());
		System.out.println("End of method:y=" + y.getName());
	}
}
