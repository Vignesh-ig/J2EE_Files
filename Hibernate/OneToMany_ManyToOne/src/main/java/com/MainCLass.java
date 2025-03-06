package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainCLass {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Staff staff=new Staff();
	staff.setName("Harish");
	staff.setSub("WebTech");
	staff.setTiming("10am");
	
	Student s1=new Student();
	s1.setName("vicky");
	s1.setAge(22);
	s1.setMarks(66);
	s1.setStaff(staff);
	
	Student s2=new Student();
	s2.setName("dinesh");
	s2.setAge(23);
	s2.setMarks(56);
	s2.setStaff(staff);
	
	Student s3=new Student();
	s3.setName("loki");
	s3.setAge(21);
	s3.setMarks(76);
	s3.setStaff(staff);
	
	List<Student> list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	staff.setStudent(list);
	
	et.begin();
	em.persist(staff);
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	et.commit();
	
	System.out.println("Data Inserted");
	
  }
}
