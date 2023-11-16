package StringsPrgms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Stringprgms {
	@Test
	public void occrenceofeachcharcter() {
		String str = "TestYantra";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (map.containsKey(c)) {
				map.put(c, 1+1);
			} else {
//			Integer value = map.get(c);
				// map.put(c, value+1);
				map.put(c,  1);
			}

		}
		System.out.println(map);
	}

	@Test
	public void removeduplicatefromstring() {
		String str = "TestYantra";
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character character : set) {
			System.out.println(character);
		}

	}

	@Test
	public void countnoofDuplicatesInanString() {
		String s = "TestYantra";
		// HashSet<Integer> set= new HashSet<Integer>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;

				}
			}
			if (count > 1) {
				System.out.println(ch + " is repeating  " + count + "times");
			}

		}
	}

	@Test
	public void CharacterPosition() {
		String inputString = "TestYantra";

		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			int position = i + 1; // Adding 1 to make positions 1-based

			System.out.println("Character: " + currentChar + ", Position: " + position);
		}
	}

	@Test
	public void CharacterPosi2tion() {

		String str = "TestYantra";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] s = str.toCharArray();
		for (char ss : s) {
			if (!map.containsKey(ss)) {
				map.put(ss, 1);

			} else {
				map.put(ss, 1 + 1);
			}
		}
		System.out.println(map);
	}
}
