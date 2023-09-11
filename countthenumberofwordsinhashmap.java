package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countthenumberofwordsinhashmap {

	public static void main(String[] args) {
		String s = " pardeep is a  good  boy  ";

		String s1[] = s.split(" "); // split method is used to split the string

		Map<String, Integer> hm = new HashMap<>();

		for (String k : s1) {
			if (hm.containsKey(k)) {

				int z = hm.get(k); // getting int value
				hm.put(k, z + 1);
			} else {
				hm.put(k, 1);
			}
		}

		System.out.println(hm);

	}

}
