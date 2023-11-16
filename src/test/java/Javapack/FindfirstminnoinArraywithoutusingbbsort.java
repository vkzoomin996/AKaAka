package Javapack;

import org.testng.annotations.Test;

public class FindfirstminnoinArraywithoutusingbbsort {
	@Test
	public void findfirstminnoinArraywithoutusingbbsort() {
		int[] a= {5,3,8,9,10};
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(" the first min no in an array is "+min);

}
	
}