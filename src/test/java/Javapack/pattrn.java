package Javapack;

import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

public class pattrn {
	@Test
	 public void nvkjn() {
		int n=5;
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = i-1; j<i; j++) {
				System.out.print("* ");

			}
			for (int j = i-1; j >=1; j--) {
				System.out.print("* ");

			}
			System.out.println();


	}

		for (int i = 2; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = i-1; j<i; j++) {
				System.out.print("* ");

			}
			for (int j = i-1; j >=1; j--) {
				System.out.print("* ");

			}
			System.out.println();

		}
		
	}
	@Test
	public void ijver() {
		int n=5;
		 for (int i = 1; i <=n; i++) {
			 for (int j = 1; j <=i; j++) {
				  System.out.print("*");
				
			}
			 System.out.println();
			
		}
		 for (int i = n-1; i >=1; i--) {
			 for (int j = 1; j <=i; j++) {
				  System.out.print("*");
				
			}
			 System.out.println();
			
		}
	}
	@Test
	public void ijver1() {
		int n=5;
 for (int i = 1; i <=n; i++) {
	 for (int j = i; j <i; j++) {
		System.out.print("  ");
	}
	 for (int j = 1; j <=i; j++) {
		System.out.print("*");
	}
	 System.out.println();}
	 for (int i = n-1; i >=1; i--) {
		 for (int j = i; j <i; j++) {
			System.out.print("  ");
		}
		 for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		 System.out.println();


}
	}
	@Test
	public  void pattrn() {
		int n=5;
		
 		for (int i = 1; i <=n; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print("*");

			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print("  ");
				
			}
			
			for (int j = 1; j<=i; j++) {
				System.out.print("*");

			}
			
			System.out.println();
		
		
		

 		 
} 
 		for (int i = n-1; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print("*");

			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print("  ");
				
			}
			
			for (int j = 1; j<=i; j++) {
				System.out.print("*");

			}
			
			System.out.println();
		
		
		

 		 
} 
	}
	@Test
	public void kjjk() {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				if(i==n||j==1)
				System.out.print("*");
				else
					System.out.print(" ");

					

			}
			for (int j = 1; j <=i; j++) {
				if(i==n||j==i)

					System.out.print("*");
				else
					System.out.print(" ");

			} 
			System.out.println();
 			
		}
	}

	@Test
	public void fvijf() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			for (int j = 1; j < 2 * i - 1; j++) {
				System.out.print("  ");}
				if (i>1) {
					System.out.print("*");

				}
				System.out.println();

			}for (int i = n-1; i>=1; i--) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print("  ");
				}
				System.out.print("*");
				for (int j = 1; j < 2 * i - 1; j++) {
					System.out.print("  ");}
					if (i > 1) {
						System.out.print("*");

					}
					System.out.println();

				}
		
	}
	@Test
	public void trbtb() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||i==n||j==n)
				System.out.print("*");
				else
					System.out.print(" ");

				
			}
			System.out.println();
			
		}
		
	}
	
	
	 	
}
