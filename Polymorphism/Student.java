package Polymorphism;

public class Student extends Marks {

    int rollno,id,age;
    String name,address;
          
    public Student( int rollno, int id, int age, String name, String address,int p, int c, int m, int b) {
			super(p, c, m, b);
			this.rollno = rollno;
			this.id = id;
			this.age = age;
			this.name = name;
			this.address = address;
		} 
    

		void disp() {
	    	 
		    	System.out.println(rollno);
		    	System.out.println(id);
		    	System.out.println(age);
		    	System.out.println(name);
		    	System.out.println(address);
		    	System.out.println(super.p+""+super.c+super.m+""+super.b);
	       }
	
    
  

  public static void main(String[] args) {
		
 	
 	  Student s1=new Student(10,1020,24,"SHivam","Pune",80,90,60,90);
s1.disp();

Student s2=new Student(10,1020,24,"Yogesh","Pune",88,99,66,99);
s2.disp();
 	 
	}

}


