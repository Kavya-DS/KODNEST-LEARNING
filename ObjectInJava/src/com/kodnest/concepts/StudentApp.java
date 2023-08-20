package com.kodnest.concepts;
public class StudentApp {
public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		s1.id=1;
		s1.age=20;
		s1.name="sahana";
		s1.branch="EC";
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.branch);
		s1.eat();
		s1.sleep();
		s1.study();
		
		s2.id=2;
		s2.age=21;
		s2.name="subash";
		s2.branch="Cs";
		System.out.println(s2.id);
		System.out.println(s2.age);
		System.out.println(s2.name);
		System.out.println(s2.branch);
		s2.eat();
		s2.sleep();
		s2.study();	
	}
}
