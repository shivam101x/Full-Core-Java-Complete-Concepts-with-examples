// Java Program to implement
// Fibonacci Series
import java.io.*;

// Driver Function
class ExFib {

	// Function to return Fibonacci value
	static int Fib(int N)//                    5
	{
		if (N == 0 || N == 1)
			return N;

		return Fib(N - 1) + Fib(N - 2);
	}

	// Main function
	public static void main(String[] args)
	{
		
		// Factorial of 3
		for (int i = 2; i < 4; i++) {
            System.out.println("Factorial of " + 5 + " "
						+ Fib(i));
        }
	}
}
