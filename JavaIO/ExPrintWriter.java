package JavaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class ExPrintWriter {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("D:\\Nitin Sir\\JavaFile\\demo1.txt");
		FileWriter fw=new FileWriter("D:\\Nitin Sir\\JavaFile\\FileWriter.txt");
		
		pw.write("Print Writer Class");
		pw.flush();
		fw.write("File Writer Class");
		fw.flush();
		System.out.println("File Created..");
		
		Reader rd=new FileReader("D:\\Nitin Sir\\JavaFile\\demo1.txt");

		BufferedReader br=new BufferedReader(rd);
		System.out.println(br.readLine());
//		int data;
//		while ((data=rd.read())!=-1) {
//			System.out.print((char)data);
//		}
	
		
	}

}
