package StringsPrgms;

import org.testng.annotations.Test;

public class Print_Max_Lenth_of_an_String_using_Array2 {
	@Test
	public void print_Lenth_of_an_String() {
		String[] s = { "12", "1234", "12345", "45", "1434234", "212142365" };
		String max_lenth = s[0];// 
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > max_lenth.length()) {
				max_lenth = s[i];
			}

		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == max_lenth.length()) {
				System.out.println(s[i] + "   ");
			}
		}

	}
}
