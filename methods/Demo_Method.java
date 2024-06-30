package methods;

public class Demo_Method {
	
	public static void show() {
		System.out.println("Welcome");
	}
	static {
		System.out.println("Static");
	}
	public static void main(String[] args) {
		Demo_Method.show();
		System.out.println("Main");
	}

}
