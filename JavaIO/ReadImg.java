package JavaIO;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadImg {

	public static void main(String[] args) throws IOException {
		
		BufferedImage bim=ImageIO.read(new File("D:\\Nitin Sir\\JavaFile\\pexels-pixabay-268533.jpg"));
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ImageIO.write(bim, "jpg", bos);
		byte []data=bos.toByteArray();
		
//		System.out.println(data.length);
		
		FileOutputStream fout=new FileOutputStream("D:\\Nitin Sir\\JavaFile\\abc.jpg");
		fout.write(data);
		for (byte b : data) {
			
			System.out.println(b);
		}
		
	}

}
