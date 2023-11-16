package StringsPrgms;

import org.testng.annotations.Test;

public class Print_Min_Length_of_an_String_using_Array {
	@Test
	public void print_Length_of_an_String() {
		String[] s = {"12", "14", "1234", "12345", "45", "1434234" };
		String min_lenth = s[0];// 12
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < min_lenth.length()) {
				min_lenth = s[i];
			}

		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == min_lenth.length()) {
				System.out.println(s[i] + "   ");
			}
		}
	}
}
