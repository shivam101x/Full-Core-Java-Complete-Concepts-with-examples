package methods;

public class Example_Boolean {
	
	
	public static boolean vote(int age) {
		boolean istrue=false;
		if (age>=18) {
			 istrue=true;
		}
		return istrue;
	}
	public static void main(String[] args) {
		if (vote(30)) {
			System.out.println("Ready to vote...");
		}
		else {
			System.out.println("Not ready to vote..");
		}
		

	}

}
