// A Java program to demonstrate
// working of recursion

class ExDemo {
	static void printFun(int test)
	{
		if (test < 1)
			return;

		else {
			System.out.println(test);

			// Statement 2
			printFun(test - 1);

			System.out.println(test);
			return;
		}
	}

	public static void main(String[] args)
	{
		int test = 3;
		printFun(test);
	}
}
