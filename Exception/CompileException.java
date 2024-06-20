package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class CompileException {

	public static void main(String[] args) {
		
		
		try {
			PrintWriter pw=new PrintWriter("D:\\Nitin Sir\\JavaFile\\demo.txt");
			pw.print("ABCD");
			pw.flush();
//			String str="Welcome";
//			byte st[]=str.getBytes();
//			FileOutputStream pw=new FileOutputStream("D:\\Nitin Sir\\JavaFile\\Demo.txt");
//			pw.write(st);
			
//			Connection con=DriverManager.getConnection(null, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("always");
		}
	}
}
