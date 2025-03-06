 
package com;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
@Table(name = "Person_Table")
public class Person {
	@Id
	@Column(name = "per_id")
	private int id;
	@Column(nullable = false)
	private String name;
	private int age;
	@Column(nullable = false, unique = true, length = 10)
	private long phone;
	private String gender;
	
	//foreign key----one to one mapping
  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Address a;
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}
}
