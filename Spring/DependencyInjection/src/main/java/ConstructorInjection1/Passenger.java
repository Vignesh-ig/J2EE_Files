package ConstructorInjection1;

public class Passenger {
	private String name;
	private String gender;
	private int age;

	public Passenger(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
