package Ex_String;

public class Student {
	int rollno;
	String name;
	

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public String toString() {
		
		return rollno+" "+name;
	}

	public static void main(String[] args) {
		
		Student st=new Student(101, "ABC");
		
		System.out.println(st.toString());

	}

}
