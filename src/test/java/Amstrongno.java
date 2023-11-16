 
public class Amstrongno {

	public static void main(String[] args) {
 int num=153, temp=num ,sum=0 ,rem=0;
 while(num>0) {
	 rem=num%10;
	 sum=sum+(rem*rem*rem);
	 num=num/10;
	 
 }if(sum==temp) {
	 System.out.println("its a Amstrong no"+sum);
 }else {
	 System.out.println("its  not a Amstrong no");

 }
	}

}
