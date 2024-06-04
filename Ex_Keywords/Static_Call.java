package Ex_Keywords;

public class Static_Call {
	void show() {
		
		System.out.println(Ex_Static.clg_code);
	}
	void show1() {
		int ab=Ex_Static.clg_code=50000;
		System.out.println(ab);
	}
	
	public static void main(String[] args) {
		Static_Call ob=new Static_Call();
		ob.show();
		ob.show1();
	}
}
