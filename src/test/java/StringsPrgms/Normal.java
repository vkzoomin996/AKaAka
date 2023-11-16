package StringsPrgms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

import Collection.Linkedlist;

public class Normal {
	@Test
	public void normal() {
		String st = "a3b2cd2";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));

		}
		int count = 0;
		for (Character ch : set) {
			if (ch == '3') {
				System.out.print("aaa");
			} else if (ch == '2') {
				System.out.print("bb");
			} else if (ch == 'c') {
				System.out.print("c");
			} else if (ch == 'd') {
				System.out.println("dd");
			}
		}

	}

	@Test
	public void nn() {
		String str = "aaabbccdd";
		int count = 1;
		for (int i = 0; i < str.length(); i = i + count) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				} else {
					System.out.print(str.charAt(i) + "" + count);
					break;
				}
			} // end of inner for

		} // end of outer for
	}// end of main

	@Test
	public void norma() {
		String st = "a3b2c1d2c3";
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			for (int j = 0; j < ch[i + 1] - 48; j++) {
				System.out.print(ch[i]);

			}

		}
	}

}
