package StringsPrgms;

import org.testng.annotations.Test;

public class SumOf2Digits {
	@Test
	public void SumOf2Digits() {
		String s="12a11b3";//12+11+3=26
		int sum=0;//0 12  23
		int tsum=0;// 0 1 12 0 1 11 0 3 
		for (int i = 0; i < s.length(); i++) {
			//i=0 0<7t
			//i=1 1<7t
			//i=2 2<7t
			//i=3 3<7t
			//i=4 4<7t
			//i=5 5<7t
			//i=6 6<7t
			//i=7 7<7f terminate
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')//1t 2t af 1t 1t bf 3t
			{
				int n=s.charAt(i)-48;//n=49-48=1, 50-48=2, 49-48=1,49-48=1,51-48=3
				tsum=tsum*10+n;//tsum=0*10+1=1,1*10+2=12,0*10+1=1,1*10+1=11,0*10+3=3
			}else {
				sum=sum+tsum;//tsum=0+12=12, 12+11=23
				tsum=0;//0
				
			}
			
		}
		sum=sum+tsum;//23+3=26
		System.out.println(sum);//2 6
		
	}
	 

}
