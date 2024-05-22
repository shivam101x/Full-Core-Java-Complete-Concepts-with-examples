package Aggregation;

public class Student {
	
	int rollno,age;
	String name,address;
	Marks marks;
	
	public Student(int rollno, int age, String name, String address, Marks marks) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	void show() {
	System.out.println("Roll No:"+rollno+" Name:"+name+" Age:"+age+" Address:"+address);
	System.out.println("Physics:"+marks.p+" Chem:"+marks.c+" Maths:"+marks.m+" bio:"+marks.b);
	}
	public static void main(String[] args) {
		
		Marks mr=new Marks(80, 70, 88, 90);
		Student s1=new Student(101, 24, "Abc", "Pune", mr);
		s1.show();
	}

}
