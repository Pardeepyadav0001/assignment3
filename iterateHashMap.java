package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class iterateHashMap {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>(); // declareing a hashmap

		hm.put("Maharashtra", "Mumbai"); // putting value into the map
		hm.put("Gujarat", "Gandhinager");
		System.out.println(hm);

		for (Map.Entry<String, String> e : hm.entrySet()) { // for ittarting
			System.out.println(e);
		}
		for (Map.Entry<String, String> e : hm.entrySet()) { // for ittarting and
			System.out.println(e.getKey()); // getting key
			System.out.println(e.getValue()); // getting value
		}
		for (String Key : hm.keySet()) { // for printing only key
			System.out.println(Key);
		}
		for (String value : hm.values()) { // for printing only values
			System.out.println(value);
		}

	}
}
