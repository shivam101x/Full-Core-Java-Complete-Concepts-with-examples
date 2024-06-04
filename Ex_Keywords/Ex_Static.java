package Ex_Keywords;

public class Ex_Static {
	
	static int clg_code=1111111;
	static {
		System.out.println("Before Main..");
	}
	public static void main(String[] args) {
		clg_code=2000;
		System.out.println(clg_code);
	}

}
