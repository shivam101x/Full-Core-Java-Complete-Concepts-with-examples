package ExList;

import java.util.Stack;

public class ExStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
		
//		System.out.println(st.empty());
		for (int i = 101; i <= 120; i++) {
			st.push(i);
		}
//		System.out.println(st);
//		System.out.println(st.peek());
		System.out.println(st.search(101));
		System.out.println(st.indexOf(101));
//		System.out.println(st.f);
		
	}

}
