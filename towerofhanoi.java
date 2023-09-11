package assignment3;

public class towerofhanoi {

	public static void tower(int n, String src, String helper, String disk) { // method decalreing
		if (n == 1) {
			System.out.println("transfer disk " + n + " from " + src + " to " + disk);
			return;
		}
		tower(n - 1, src, disk, helper);

		System.out.println("transfer disk " + n + " from " + src + " to " + disk);

		tower(n - 1, helper, src, disk);
	}

	public static void main(String[] args) {
		int n = 3;
		tower(n, "s", "h", "d"); // method calling
	}

}
