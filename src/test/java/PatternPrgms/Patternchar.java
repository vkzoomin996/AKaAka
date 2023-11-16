package PatternPrgms;

import org.testng.annotations.Test;

public class Patternchar {
	@Test
	public void pattern() {
//		A B C D E
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 
		int n = 5;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

	@Test
	public void pattern1() {
		// a
		// a b
		// a b c
		// a b c d
		// a b c d e
		int n = 5;
		// row
		for (int i = 0; i < n; i++) {
			// col
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print((char) ('a' + j) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	@Test

	public void pattern2() {
		// a
		// b b
		// c c c
		// d d d d
		// e e e e e
		int n = 6;
		// row
		for (int i = 0; i < n; i++) {
			// col
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					
					System.out.print((char) ('a' + i) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	@Test
	public void pattern3() {
//	A B C D E
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			char ch = 'A';

			for (int j = 1; j <= n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern4() {
		//a
		//b c
		//d e f
		//g h i j
		//k l m n o
		int n = 5;
		char ch = 'a';
		for(int i = 1;i<=n;i++){
		for(int j=1;j<=n;j++){
		if(i>=j){
		System.out.print(ch++ +" ");
		}else{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		}
	@Test
	public void pattern5() {
		//a
		//b c
		//c d e
		//d e f g
		//e f g h i
   		int n = 5;
		for (int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(i>=j){
		System.out.print((char)('a'+i+j)+" ");
		}else{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		}
	}

		
	


