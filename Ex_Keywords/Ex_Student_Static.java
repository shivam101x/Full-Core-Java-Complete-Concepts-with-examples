package Ex_Keywords;

public class Ex_Student_Static {
	 int rollno;
	 String name; 
	 static int count=0;
	 static String clgname; 
	public Ex_Student_Static(String name) {
		super();
		this.name = name;
		this.rollno=setroll();
	}
	static int setroll(){
		count++;
		return count;
	}
	static void setClg(String clgn){
		clgname=clgn;
	}
	void getStudentInfo(){
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(clgname);
	}
	public static void main(String[] args) {
		setClg("Collage_Name");
		Ex_Student_Static ob1=new Ex_Student_Static("ABC");
		Ex_Student_Static ob2=new Ex_Student_Static("XYZ");
		ob1.getStudentInfo();
		ob2.getStudentInfo();
	}
}
