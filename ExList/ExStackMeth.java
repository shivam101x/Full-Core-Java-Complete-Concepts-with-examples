package ExList;

import java.util.Stack;

public class ExStackMeth {
	
	static void pushelmnt(Stack<Integer> st,int num){
		st.push(num);
		System.out.println("Push->"+st);
	}

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		
		System.out.println(st);
		
		pushelmnt(st,20);
		pushelmnt(st,10);
		pushelmnt(st,50);
		pushelmnt(st,30);
		pushelmnt(st,40);
		pushelmnt(st,60);
		
//		System.out.println(st.peek());
		System.out.println(st.indexOf(20));

	}

}
