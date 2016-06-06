package cn.c0405.constructortest;
/*
 * 演示对象构造器
 */
public class ConstructorTest {
	public static void main(String[] args) {
		//填员工信息
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry",40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//打印员工信息
		for(Employee e : staff)
			System.out.println("name="+e.getName() + ",id="+e.getId()+",salary="+e.getSalary());
	}
}
