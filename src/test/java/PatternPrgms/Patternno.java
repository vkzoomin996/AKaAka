package PatternPrgms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Patternno {
	@Test
	public void pattern() {
//		1 1 1 1 1
//		1 1 1 1 1
//		1 1 1 1 1
//		1 1 1 1 1
//		1 1 1 1 1
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("1 ");
			}
			System.out.println();

		}

	}

	@Test
	public void pattern1() {
//		1 1 1 1 1
//		2 2 2 2 2 
//		3 3 3 3 3
//		4 4 4 4 4
//		5 5 5 5 5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " ");

			}

			System.out.println();
		}

	}

	@Test
	public void pattern2() {
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

	}

	@Test
	public void pattern3() {
//		1
//		1 2
//		1 2 3 
//		1 2 3 4
//		1 2 3 4 5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j--) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

	}

	@Test
	public void pattern4() {
//		1 1 1 1 1
//		2 2 2 2
//		3 3 3
//		4 4 
//		5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i + " ");

			}

			System.out.println();
		}
	}

	@Test
	public void pattern5() {
//		              1
//		            2 2
//		          3 3 3
//		        4 4 4 4 
//		      5 5 5 5 5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");// 2space

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

	}

	@Test
	public void pattern6() {
//		1 2 3 4 5
//		  2 3 4 5 
//		    3 4 5 
//		      4 5
//		        5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");// 2space

			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	@Test
	public void pattern7() {
//		    1 
//		   2 2 
//		  3 3 3 
//		 4 4 4 4 
//	    5 5 5 5 5 		           
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <n; j++) {
				System.out.print(" ");//1space

			}
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}

			System.out.println();
		}
		}

	@Test
	public void pattern8() {
//		5 4 3 2 1 
//		5 4 3 2 
//		5 4 3 
//		5 4 
//		5
		int n=5;
		for(int i=1; i<=n; i++) {
			int k=5;
			for(int j=i; j<=n;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
			}
		}
	@Test
	public void pattern9() {
//		1
//		2 2
//		1 1 1 
//		2 2 2 2 
//		1 1 1 1 1
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=i; j++) {
				if(i%2==0) {
				System.out.print("2 ");
				
			}
				else{
					System.out.print("1 ");
}
				}
			System.out.println();
			
		}
	}
	@Test
	public void patte() {
//		1 
//		2 2 
//		1 2 3 
//		4 4 4 4 
//		1 2 3 4 5 
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=i; j++) {
				if(i%2==0) {
				System.out.print(i+" ");
				
			}
				else{
					System.out.print(j+" ");
}
				}
			System.out.println();
			
		}
	}

		
	

}
