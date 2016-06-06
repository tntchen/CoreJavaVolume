package cn.c0601_2.interfacedemo;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 此程序演示比较接口的使用
 */
public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[]	staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tont Tester", 38000);
		
		Arrays.sort(staff);
		
		//打印所有员工信息
		for (Employee e : staff) {
			System.out.println("name="+e.getName()+",salary="+e.getSalary());
		}
	}
}
