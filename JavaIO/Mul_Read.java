package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Mul_Read {

	public static void main(String[] args) throws IOException {
		
		InputStream in1=new FileInputStream("D:\\Nitin Sir\\JavaFile\\demo1.txt");
		InputStream in2=new FileInputStream("D:\\Nitin Sir\\JavaFile\\demo2.txt");
		InputStream demo3=new FileInputStream("D:\\Nitin Sir\\JavaFile\\demo.txt");
		SequenceInputStream sq=new SequenceInputStream(in1, in2);
		SequenceInputStream sqfi=new SequenceInputStream(sq,demo3);
		
		int data;
		while ((data=sqfi.read())!=-1) {
			System.out.print((char)data);
		}
		

	}

}
