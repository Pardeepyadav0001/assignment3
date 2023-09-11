package assignment3;

public class removespaces {

	public static void main(String[] args) {
		String s = "pardeep yadav";
		for (char c : s.toCharArray()) { // CharArray() method converts the given string into a sequence of characters.
											// The returned array length is equal to the length of the string
			if (c != ' ')
				System.out.print(c);
		}
	}

}
