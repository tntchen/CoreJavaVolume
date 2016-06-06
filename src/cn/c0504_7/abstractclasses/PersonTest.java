package cn.c0504_7.abstractclasses;

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons= new Person[2];
		
		persons[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		persons[1] = new Student("Maria Morris", "Computer Science");
		
		for (Person p : persons) {
			System.out.println(p.getName()+","+p.getDescription());
		}
	}
}
