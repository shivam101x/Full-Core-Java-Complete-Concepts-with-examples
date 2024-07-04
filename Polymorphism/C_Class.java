package Polymorphism;

public class C_Class extends P_Class {

	void shape() {
		super.shape();
		System.out.println("Square");
	}
	public static void main(String[] args) {
		C_Class ob = new C_Class();
		ob.shape();

	}

}
