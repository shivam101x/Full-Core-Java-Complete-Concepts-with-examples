package Recursion;


public class ExFibonacci {
	
	static int fib(int n) {//4 +3
		if(n==0||n==1)
		return n;
		
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		
		
			System.out.print(fib(2)+" ");
		
	}

}
