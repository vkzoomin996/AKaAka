
public class Reversenopallindrome {

	public static void main(String[] args) {
 int num=121 ,rem=0 , temp=num ,sum=0;
 while(num>0) {
	 rem=num%10;
	 sum=(sum*10)+rem;
	 num=num/10;
 	 
 }if(temp==sum) {
	 System.out.println("its a palindrome"+sum);
 }else {
	 System.out.println("its not a palindrome"+sum);

 }
	}

}
