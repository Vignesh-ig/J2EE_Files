package ConstructorInjection1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private double sal;
	private String company;
	private long phone;
	private List<String> names;
	private Set<Integer>empid;
	private Map<Integer,String>loc;
	
	public Employee(int id, String name, double sal, String company, long phone, List<String> names,
			Set<Integer> empid, Map<Integer, String> loc) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.company = company;
		this.phone = phone;
		this.names = names;
		this.empid = empid;
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", company=" + company + ", phone=" + phone
				+ ", names=" + names + ", empid=" + empid + ", loc=" + loc + "]";
	}
}
