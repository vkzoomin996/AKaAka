package Javapack;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Addingof2arrays {
	@Test
	public void addingof2arrays() {

		int[] a = { 4, 2, 6, 1, 7 };
		int[] b = { 3, 1, 7, 2 };
		// 7 3 13 3 7
		int length = a.length;// 5
		if (a.length < b.length) { // 5<4
			length = b.length;
		}
		for (int i = 0; i < length; i++) {
			// i=0 ; 0<5t
			// i=1 ; 1<5t
			// i=2 ; 2<5t
			// i=3 ; 3<5t
			// i=4 ; 4<5t

			try {
				System.out.println(a[i] + b[i] + "");
				// 4+3=7
				// 2+1=3
				// 6+7=13
				// 1+2=3
				// 7+ArrayIndexoutofboundException
			} catch (Exception e) {
				if (a.length < b.length)// 5<4f

				{
					System.out.println(b[i]);
				} else {
					System.out.println(a[i]);// 7
				}
			}

		}
	}

}
