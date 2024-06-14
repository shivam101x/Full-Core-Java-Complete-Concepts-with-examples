package ExList;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ExVector {

	public static void main(String[] args) {
		
	    Vector<String> vec = new Vector<String>(4);  
        //Adding elements to a vector  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        //Check size and capacity  
        System.out.println("Size is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());  
        //Display Vector elements  
        System.out.println("Vector element is: "+vec);  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");
        vec.addElement("Duck");
        vec.addElement("Abc");
       
        //Again check size and capacity after two insertions  
        System.out.println("Size after addition: "+vec.size());  
        System.out.println("Capacity after addition is: "+vec.capacity());  
        //Display Vector elements again  
        
//        Collections.sort(vec);
//        Collections.reverse(vec);
        System.out.println("Elements are: "+vec);
        Collections.rotate(vec, 4);
        System.out.println("Elements are: "+vec);
	}

}
