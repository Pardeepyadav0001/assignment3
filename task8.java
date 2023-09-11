package assignment3;

//Write a program to implement queue
public class task8 {

	static class Queue {
		static int arr[]; // decalreing varibles
		static int size; // decalreing varibles
		static int rear; // decalreing varibles

		Queue(int size) {
			this.size = size;
			arr = new int[size];
			rear = -1;
		}

		public static boolean isempty() { // decalreing method 
			return rear == -1;

		}

		public static boolean isfull() { // decalreing method 
			return rear == size - 1;

		}

		public static void add(int data) { // decalreing method 

			if (isfull()) {
				System.out.println("overflow");
				return;
			}
			arr[++rear] = data;
		}

		public static int remove() { // decalreing method 
			if (isempty()) {
				System.out.println("empty queue");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;

		}

		public static int peek() { // decalreing method 

			if (isempty()) {
				System.out.println("empty queue");
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(10); // method calling 
		q.add(15);
		q.add(17);
		q.add(25);
		q.add(55);
		System.out.println(q.remove());
		System.out.println(q.peek());
	}

}
