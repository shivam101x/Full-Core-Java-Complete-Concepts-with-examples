package Constructor;

public class Student {
	int rollno;
	String name;
	String address;
	
	public Student() {
		System.out.println("Constructor Called..");
	}
	
	public Student(int rollno, String nm, String ad) {
		this.rollno=rollno;
		name=nm;
		address=ad;
	}
	void display() {
		System.out.println("Roll No: "+rollno+"\nName: "+name+"\nAddress:"+address);
		
	}
	public static void main(String[] args) {
		
		Student stud=new Student();
		Student st=new Student(101, "Abc", "Pune");
		st.display();
	}

}
