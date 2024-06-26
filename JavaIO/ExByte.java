package JavaIO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExByte {

	public static void main(String[] args) throws IOException {
		
		String nm="Abc";
		
		byte by[]=nm.getBytes();
		OutputStream out=new FileOutputStream("D:\\Nitin Sir\\JavaFile\\demo1.txt");
		OutputStream out2=new FileOutputStream("D:\\Nitin Sir\\JavaFile\\demo2.txt");
				
		BufferedOutputStream bout=new BufferedOutputStream(out);
		bout.write(by);
		bout.flush();
		for (byte b : by) {
			System.out.println((char)b);
		}
		ByteArrayOutputStream barr=new ByteArrayOutputStream();
		barr.write(by);
		barr.writeTo(out);
		barr.writeTo(out2);

	}

}
