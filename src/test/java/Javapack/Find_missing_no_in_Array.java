package Javapack;

import org.testng.annotations.Test;

public class Find_missing_no_in_Array {
public static void main(String[] args) {
	int[] a= {1,2,3,5};
	int sum=0;
	int sum1=0;

	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
		
	}
	System.out.println(sum);
	
	for(int i=0;i<=5;i++) {
		sum1=sum1+i;
		
	}
	System.out.println(sum1);
	
	System.out.println("missing no is"+(sum1-sum));
}
@Test
public void method2() {
	int[] a= {2,4,6,10};
	int sum=0;
	int sum1=0;
	int n = a.length+1;
	  sum = (n * (n + 1));
	  System.out.println(sum);
 		for (int j = 0; j < a.length; j++) {
			sum1=sum1+a[j];

		}
		
	
	System.out.println(sum1);
	System.out.println(""+(sum-sum1));

	
}
@Test
public void method() {
	int[] a= {1,3,5,9};
	int sum=0;
	int sum1=0;
	int n = a.length+1;
	  sum = (n * (n ));
	  System.out.println(sum);
 		for (int j = 0; j < a.length; j++) {
			sum1=sum1+a[j];

		}
		
	
	System.out.println(sum1);
	System.out.println(""+(sum-sum1));

}
}