package assignment3;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no till print pascal triangle :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) { // for 1st half
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) { // for 2nd half
				System.out.print(j);
			}
			System.out.println();

		}

	}

}
