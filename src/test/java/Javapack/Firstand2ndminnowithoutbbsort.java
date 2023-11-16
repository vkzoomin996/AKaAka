  package Javapack;

import org.testng.annotations.Test;
 public class Firstand2ndminnowithoutbbsort {
	 @Test

	public void firstand2ndminnowithoutbbsort() {
  		int a[]= {20,25,4,6,12};
		int fmin=a[0];
		int smin=a[1];
		for(int i=0;i<a.length;i++) 
		{
		     if(a[i]<=fmin)// 20<=20 , 25<=20 , 4<=20 ,6<=4 , 12<=4
		     {
		    	 if(a[i]!=fmin)// 20!=20 , 4!=20
		    	 {
		    		 smin =fmin;//  20
		 
		    	 }
		    	 fmin =a[i];//  20 , 4
		     }
		     else if(smin==fmin || smin>a[i])//20==4 || 20>6 
		    	 
		     {
		    	 smin=a[i];// 6
		     }
		}
		System.out.println(fmin);

		System.out.println(smin);
			
		}

	
	
	  

}
