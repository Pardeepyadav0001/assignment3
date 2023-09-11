package assignment3;

import java.util.Arrays;
import java.util.List;

//  Write a Program to iterate ArrayList using for-loop, while-loop, and advance for-loop:
public class task11 {

	public static void main(String[] args) {
		// defining a List
		List<String> fruits = Arrays.asList("apple", "fig", "papaya");

		System.out.println(fruits);

		for (int i = 0; i < fruits.size(); i++) {
			// prints the elements of the List
			System.out.println(fruits.get(i));
		}
		int i = 0;
		while (i < fruits.size()) {
			System.out.println(fruits.get(i));
			i++;
		}
		for (String n : fruits) {
			System.out.println(n);
		}

	}

}
