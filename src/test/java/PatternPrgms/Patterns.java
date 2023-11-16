package PatternPrgms;

import org.testng.annotations.Test;

public class Patterns {
	@Test
	public void pattern() {
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	@Test
	public void pattern1() {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// i=1 1<=5t
			// i=2 2<=5t
			// i=3 3<=5t

			for (int j = 1; j <= i; j++) {
				// j=1 1<=1t
				// j=1 1<=2t
				// j=2 2<=2t
				// j=3 3<=2f

				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	@Test
	public void pattern2() {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	@Test
	public void pattern3() {
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <=n; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

	@Test
	public void pattern4() {
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");

			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

	@Test
	public void pattern5() {
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		int n = 5;
		for (int i = 1; i <= n; i++) {

		for (int j = n; j > 0; j--) {
				if (i >= j) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	@Test
	public void pattern6() {
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = n; j >= 1; j--) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	@Test
	public void star() {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

	@Test
	public void pattern121() {
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i-1; j >= 1; j--) {
				System.out.print("*");

			}
			

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			
			System.out.println();
		}

	}

	@Test
	public void pattern1212() {
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *

		int n = 5; // Number of rows for the inverted pyramid

		for (int i = n; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print("*");

			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	@Test
	public void pattern11() {
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");

			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	@Test
	public void pattern1122() {
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  * 
//		 *  *  * 
//		 *  * 
//		 * 

		int n = 6;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();

		}
		for (int i = n-1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();

		}

	}

	@Test
	public void pattern61122() {
//		 *  *  *  *  * 
//		 *           * 
//		 *           * 
//		 *           * 
//		 *  *  *  *  * 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
	}

	@Test
	public void pattern111() {
		int n = 5;
//		    *
//		   * *
//		  *   *
//		 *     *
//		*********
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <i; j++) {
				if (i == n || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				if (i == n || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	 
		 

		 

	@Test
	public void pattern1545421() {
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *

		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = i; j >= 1; j--) {
				System.out.print("*");

			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

		for (int i = n - 1; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print("*");

			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	@Test
	public void geg() {
//	     *
//	    * *
//	   *   *
//	  *     *
//	 *       *
//	  *     *
//	   *   *
//	    * *
//	     *
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int k = 1; k < 2 * i - 2; k++) {
				System.out.print(" ");
			}

			if (i > 1) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int k = 1; k < 2 * i - 2; k++) {
				System.out.print(" ");
			}

			if (i > 1) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}