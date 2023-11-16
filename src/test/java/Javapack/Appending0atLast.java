package Javapack;
import java.io.*; 	import java.util.Arrays;

import org.testng.annotations.Test;


public class Appending0atLast {
 
  	       public static void main(String[] args) {
 	          int[] a = {1, 2, 3, 4, 0, 0, 0, 5, 6};

 	          int nonZeroCount = 0;

 	          for (int i = 0; i < a.length; i++) {
 	              if (a[i] != 0) {
 	                  int temp = a[i];
 	                  a[i] = a[nonZeroCount];
 	                  a[nonZeroCount] = temp;
 	                  nonZeroCount++;
 	              }
 	          }

 	          System.out.println("Original Array with Zeros Appended: ");
 	          for (int value : a) {
 	              System.out.print(value + " ");
 	          }
 	      }
  	       @Test
  	       public void appending() {
  	          int[] a = {1, 2, 3, 4, 0, 0, 0, 5, 6};
  	          for (int i = 0; i < a.length; i++) {
  	        	  if(a[i]!=0)
  	  	          System.out.print(a[i]+",");

			}
  	        for (int i = 0; i < a.length; i++) {
	        	  if(a[i]==0)
	  	  	          System.out.print(a[i]+",");

			}

  	       }
 	  
}