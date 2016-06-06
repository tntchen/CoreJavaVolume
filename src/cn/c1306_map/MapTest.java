package cn.c1306_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 演示映射表的使用:String--Employee
 */
public class MapTest {
	 public static void main(String[] args) {
		Map<String, Employee> staff = new HashMap<>();
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));
		
		System.out.println(staff);
		
		staff.remove("567-24-2546");
		
		staff.put("456-62-5527", new Employee("Francesca Miller"));
		
		System.out.println(staff.get("157-62-7935"));
		
		//Set<Map<String, Employee>> entrySet = staff.entrySet();
		for (Entry<String, Employee> entry : staff.entrySet()) {
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key="+key+",value="+value);
		}
	}
}
