package Ex_String;

public class Ex_Reverce {

	public static void main(String[] args) {
		
		String str="ABCD";
		
		for (int i = str.length()-1; i>= 0 ; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
