package Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExThrows{

	public static void main(String[] args) throws FileNotFoundException, SQLException,InterruptedException {
		
		PrintWriter pw=new PrintWriter("D:\\Nitin Sir\\JavaFile\\demo.txt");
		Thread.sleep(5000);
		System.out.println("Hello");
		Connection con=DriverManager.getConnection("");

	}

}
