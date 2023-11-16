package Javapack;

public class Check_equality_of_2_array {
	public static void main(String[] args) {
		int[] a= {1,2,7,4,5};
		int[] a1= {1,2,3,4,5,};
 
	boolean status=false;
	if(a.length==a1.length)
	{
					for (int i = 0; i < a.length; i++) {
	
				if(a[i]==a1[i]) {
				status=true;

		}else {
			status=false;
		}
		
					}}
	
if(status==true) {
System.out.println("Arrays are equal");

}else {
	System.out.println("Arrays are not equal");

}
}
}