package ExList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	int rollno;
	String name;
	

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	void show() {
		System.out.println(rollno+" "+name);
	}

	public static void main(String[] args) {
		
		Student st1=new Student(101, "Abc");
		Student st2=new Student(102, "Opq");
		Student st3=new Student(103, "Xyz");
		
		List<Student> list=new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for (Student students : list) {
			students.show();
		}
//		List<String> list=new ArrayList();
//		
//		list.add("Mango");
//		list.add("Apple");
//		list.add("Kiwi");
//		list.add("Orange");
//		list.add("Apple");
//		
//		Iterator iterator=list.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
//		
//		for (String st : list) {
//			System.out.println(st);
//		}

	}

}
