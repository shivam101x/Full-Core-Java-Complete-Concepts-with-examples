package Exception;

import java.io.FileNotFoundException;

public class ExThrow {
	
	void div(int a,int b) throws FileNotFoundException{
		
		throw new FileNotFoundException("Zerooo");
	}

	public static void main(String[] args) {
		
		ExThrow ob=new ExThrow();
		try {
			ob.div(10, 0);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
