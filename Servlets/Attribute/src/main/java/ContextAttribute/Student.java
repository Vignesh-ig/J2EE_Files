package ContextAttribute;

public class Student {
	private String name;
	private int age;
	private double mark;
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}
}
