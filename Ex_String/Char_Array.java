package Ex_String;

public class Char_Array {

	public static void main(String[] args) {
		
		String st="Welcome to Abc";
		
		for (int i = 0; i < st.length(); i++) {
			int arr=st.charAt(i);
			System.out.print((char)arr);
		}
	}

}
