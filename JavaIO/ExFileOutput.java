package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExFileOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream out=new FileOutputStream("D:\\Nitin Sir\\JavaFile\\abc.txt");
		BufferedOutputStream bout=new BufferedOutputStream(out);
		

		String str="Welcome";
		byte st[]=str.getBytes();
//		for (int i = 0; i < st.length; i++) {
//			int ab=st[i];
//			System.out.print(ab+":"+(char)ab+" ");
//		}
		out.write(st);
	}

}
