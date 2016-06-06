package cn.c0403.statictest;
/*
 * 静态方法的说明程序
 */
public class StaticTest {
	public static void main(String[] args) {
		//用三个员工填充职员域
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom",40000);
		staff[1] = new Employee("Dick",60000);
		staff[2] = new Employee("Harry",65000);
		
		//打印所有员工信息
		for (Employee e : staff) {
			e.setId();
			System.out.println("name="+e.getName()+",id"+e.getId()+",salary="+e.getSalary());			
		}
		
		int n = Employee.getNextId();//使用静态方法
		System.out.println("Next available id="+ n);
	}
}
