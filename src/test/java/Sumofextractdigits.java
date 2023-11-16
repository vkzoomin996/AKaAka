
public class Sumofextractdigits {

	public static void main(String[] args) {
 int num=321 ,rem=0, sum=0;
 while(num>0) {
	 rem=num%10;
	 sum=sum+rem;
	 num=num/10;
 }
 System.out.println(sum);
	}

}
