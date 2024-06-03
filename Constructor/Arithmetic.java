package Constructor;

public class Arithmetic {

	public Arithmetic() {
		System.out.println("No args Constructor");
	}
	Arithmetic(int a) {
		System.out.println(a);
	}

	Arithmetic(int a, int b) {
		System.out.println(a+b);
	}

	Arithmetic(int a, int b,int c) {
		System.out.println(a+b+c);
	}

	Arithmetic(int a, double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Arithmetic ob=new Arithmetic();
		Arithmetic ob1=new Arithmetic(10);
		Arithmetic ob2=new Arithmetic(10,20);
		Arithmetic ob3=new Arithmetic(10,20,50);
		Arithmetic ob4=new Arithmetic(20,10.5);
	}

}
