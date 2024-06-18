package Inheritance;

public class C extends B{
	int c=200;
	String cmeth() {
		
		return "Method of C class";
	}
	public static void main(String[] args) {
		
		C ob=new C();
		System.out.println(ob.c);
		String st=ob.cmeth();
		String ct=st.concat(" ABCD");
		System.out.println(ct);
		
		System.out.println(ob.a);
		ob.metha();
		
	}

}
