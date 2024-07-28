
// Find Fibonacci Series of n where n>2
// n if n==0, n==1
// fib(n)=fib(n-1)+fib(n-2)

//TC=O(2n)
//AS=O(n)

public class Fibonacci {
	
	static int fib(int n) {//4 +3
		if(n==0||n==1)
		return n;
		
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			System.out.print(fib(i)+" ");
		}
	}

}
