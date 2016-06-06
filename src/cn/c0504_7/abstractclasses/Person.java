package cn.c0504_7.abstractclasses;

public abstract class Person {
	public abstract String getDescription();

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
