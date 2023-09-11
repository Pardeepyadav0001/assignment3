package assignment3;

import java.util.Stack;

public class implementstack {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<>(); // creating an instance of Stack class

		boolean result = stk.empty(); // checking stack is empty or not
		System.out.println("Is the stack empty? " + result);
		// pushing elements into stack
		int n = 5;
		
		for(int i=0;i<=n;i++) {
			stk.push(i);
		}
		
		
		
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);

		System.out.println("Elements in Stack: " + stk); // prints elements of the stack
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);
	}
}
