

import java.util.Scanner;

public class ExRecursion {
	static int num;
	int fact(int n) {
		if(n==1)
		return 1;
		
		int result=fact(n-1)*n;  //5-1=4*5   20 *3 =60 60*2 =120 120*1 =120
		return result;
	}
	
	public static void main(String[] args) {
		
		ExRecursion ob=new ExRecursion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
		System.out.println("Factorial of "+num+" is "+ob.fact(num));
	}

}
