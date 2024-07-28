package Recursion;

public class ExNum {
	
	static void num(int n) {
		
		if(n<=10) {
			System.out.println(n);
			 num(n+1);
			 System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		
		num(1);

	}

}
