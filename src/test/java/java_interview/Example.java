package java_interview;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Example {
	@Test
	private void pub() {
		int[] a = { 1, 2, 7, 9, 16, 99, 100 };
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				aa.add(a[i]);
 			}
 		}
		System.out.println(aa);

		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 == 1) {
				ab.add(a[j]);
			}
		}
		System.out.println(ab);

	}
	 
@Test
public void paub() {
	String str="abcde";
	String str1="1234";
	String output ="";
	   int len1 = str.length();
       int len2 = str1.length();
       int i = 0, j = 0;

       while (i < len1 || j < len2) {
           if (i < len1) {
        	   output=output+(str.charAt(i));
               i++;
           }
           if (j < len2) {
        	   output=output+(str1.charAt(j));
               j++;
           }
       }
System.out.println(output);
}

@Test
public void prgm1() {
	 char[] pp = {'v', 'e', 'e', 'r', 'e','s','h','a'};

     for (int i = 0; i < pp.length; i++) {
         for (int j = 0; j <= i; j++) {
             System.out.print(pp[j] + " ");
         }
         System.out.println();
     }
 }
@Test
public void ppp() {
         int n = 5;  // Change the value of 'n' to adjust the size of the pyramid
        for (int i = 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
     @Test
     public void pattern() {
//        	 *
//    	    ***
//         *****
//    	  *******
//       *********
     	 int n=5;
    	 for (int i = 0; i <= n; i++) {
    		 for (int j = 1; j <=n-i ; j++) {
    			 System.out.print(" ");
				
			}
    		 // Print ascending numbers
             for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }

             // Print descending numbers
             for (int j = i - 1; j >= 1; j--) {
                 System.out.print("*");
             }

             // Move to the next line
             System.out.println();
         
    		 
    	 }
     }
     @Test
	 public void  prgm() {
String s="aabb1235dd45ee1ff44";
String s1="";
String a = s.replaceAll("[a-z]+", ",");
char[] ch = a.toCharArray();
System.out.println( ch);

ArrayList<Integer>aa=new ArrayList<Integer>();
for (int i = 0; i <a.length(); i++) {
	 aa.addAll(a.charAt(i));
}
 
   
     }}

 