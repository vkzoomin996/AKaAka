package Javapack;

public class Count_even_and_odd_no_in_num {
public static void main(String[] args) {
	int num=123456789;
	int even=0;
	int odd=0;
	int rem=0;
	
	while(num>0) {
		rem=num%10;
		if(rem%2==0) {
			even++;
			
		}else {
			odd++;
			
		}
		num=num/10;
		
	}
	System.out.println(even+"      "+odd);
 
}
}
