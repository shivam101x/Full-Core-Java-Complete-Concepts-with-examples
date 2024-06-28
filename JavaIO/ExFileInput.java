package JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExFileInput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("D:\\Nitin Sir\\JavaFile\\abc.txt");
		BufferedInputStream bin=new BufferedInputStream(in,2);
//		bin.read();
		int data;
		System.out.println(bin.available());
		while ((data=bin.read())!=-1) {
			System.out.print((char)data);
		}
		
	}

}
