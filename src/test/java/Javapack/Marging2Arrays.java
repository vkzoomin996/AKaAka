package Javapack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Marging2Arrays {
	@Test
	public void marging2Arrays() {
		int[] a = { 1, 2, 3 };
		int[] b = { 5, 6, 7 };

		ArrayList<Integer> aaa = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			aaa.add(a[i]);
			aaa.add(b[i]);

		}

		System.out.println(aaa);

	}

	@Test
	public void marging2Arrays1() {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7 };
		int[] ab = new int[a.length + b.length];
		int index = 0;
		for (int ab1 : a) {
			ab[index] = ab1;
			index++;
		}
		for (int ab2 : b) {
			ab[index] = ab2;
			index++;
		}
		System.out.println(Arrays.toString(ab));
	}

	@Test
	public void marging2Arrays2() {

		int[] a= {1,3,5,7,9,11,12,12};
		int[] b= {2,4,6,8,10};
	 
		  
			  
ArrayList<Integer>aa=new  ArrayList<Integer>();
for (int i = 0; i <a.length; i++) {

 try {

  aa.add(a[i]);
  aa.add(b[i]);
  
  }catch(Exception e) {
 		  

 }

  }
System.out.println(aa);
 
 		 
 }
	@Test
	public void marging2Arrays3() {
		int[] a= {1,7,9};
		int[] b= {2,3,4,5,6,8,10,11,12};
		int j=0;
		for (int i = 0; i <b.length; i++) {
			if(a[j]<b[i]) {
				System.out.print(a[j]+" ");
				
				a[j]=13;
				j++;
			}
			if(j>a.length-1) 
			{
				j=0;
			}
			System.out.print(b[i]+"  ");
		}
	}

	@Test
	public void pattern() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");

			}
			for(int j=i-1; j>=1; j--) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
		 
 		
  			
 			
	 
		 
	}
	@Test
	public void reverse() {
		String s="veeresha";
		String rev="";
		
		for (int i =s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	
	 @Test
	 public void rev() {
		 String s="hi hello welcome";
		 String[] ss = s.split(" ");
		 for (int i = 0; i < ss.length; i++) {
			String str = ss[i]+" ";
			for (int j = str.length()-1; j >=0; j--) {
				System.out.print(str.charAt(j));
			}
		}
			System.out.println();

	 }
	 @Test
	 public void rev1() {
		 String s="hi hello welcome  ";
		 String[] s1 = s.split(" ");
		int a =s1[0].length();
		int b =s1[1].length();

		 String rev = "";
		 for (int i = s1.length - 1; i >= 0; i--) {
		 	String s2 = s1[i];
		 	
		 		for (int j = s2.length() - 1; j >= 0; j--) {
		 		rev = rev + s2.charAt(j);
		 	}

		 }
		 System.out.print(rev.substring(0,a)+" ");
		 System.out.print(rev.substring(a,a+b)+" ");
		 System.out.println(rev.substring(a+b)+" ");


		  
		 }
	 @Test
	 public void revvv() {
		 String s="hi  hello welcome too restassured";
		 //de russa tseroot emo clewollehih
 
  		 String rev="";
  		 String   ss = s.replaceAll("\\s", "");
		 for (int i = ss.length()-1; i >=0; i--) {
 				rev=rev+ss.charAt(i);
			
		}
 		 for (int i = 0; i < s.length(); i++) {
			 if(s.charAt(i)==' ') {
				 rev=rev.substring(0, i)+" "+rev.substring(i, rev.length());
			 }
		}
		 System.out.println(rev);

	 }
		 
	 
}


	

 
 
 
