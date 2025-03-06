package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	private int tid;
	private String name;
	private String boarding;
	private String designation;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Train [tid=" + tid + ", name=" + name + ", boarding=" + boarding + ", designation=" + designation + "]";
	}

}
