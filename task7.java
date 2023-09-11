package assignment3;

//Write a program to implement stack
import java.util.ArrayList;

public class task7 {
	static class stack {
		ArrayList<Integer> list = new ArrayList<>();

		public void push(int data) {
			list.add(data);
		}

		public boolean isempty() {
			return list.size() == 0;
		}

		public int pop() {
			if (isempty()) {
				return -1;
			}
			int top = list.remove(list.size() - 1);
			return top;
		}

		public int peek() {
			if (isempty()) {
				return -1;
			}

			return list.get(list.size() - 1);
		}

	}

	public static void main(String args[]) {

		stack Stack = new stack();

		Stack.push(23);
		Stack.push(55);
		Stack.push(28);
		Stack.push(95);
		Stack.push(15);

		while (!Stack.isempty()) {
			System.out.println(Stack.peek());

			Stack.pop();
		}

	}

}
