package com.velocity.arraylist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	public static void main(String[] args) {
		
		List<Employee> l=new LinkedList<Employee>();
		Employee e=new Employee();
		e.setId(1);
		e.setName("nishant");
		e.setId(2);
		e.setName("tom");
		l.add(e);
	//	System.out.println(l);
		for(Employee emp:l) {
			System.out.println(emp);
		}
		
	}

}
