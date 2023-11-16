package Javapack;

import org.testng.annotations.Test;

public class Swapingtwousing3rd {
	@Test
	public void swaping2nousing3rdvariable() {
		int a=20;
		int b=30;
		int temp =a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
	


}
