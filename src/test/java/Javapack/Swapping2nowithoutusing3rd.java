package Javapack;

import org.testng.annotations.Test;

public class Swapping2nowithoutusing3rd {
	@Test
	public void swaping2nowithoutusing3rdvariable() {
		//int a=20;
		//int b=30;
		//logic=1
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		logic =2
//		values should be greater than zero
//		a=a*b;//20*30=600
//		b=a/b;//600/30=20
//		a=a/b;//600/20=30
//		
		
		
		//bitwize operater
	int	a=10;//1010
	int	b=20;//10100
//		a=a^b;//30
//		b=a^b;//10
//		a=a^b;//20
		
	
	//single statement
	b=a+b-(a=b);//<------right to left
	a=a+b-(a=b);	
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
}
