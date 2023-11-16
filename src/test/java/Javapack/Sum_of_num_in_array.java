package Javapack;

public class Sum_of_num_in_array {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int sum=0;

	//logic=1
//	for (int i = 0; i < a.length; i++) {
//		sum=sum+a[i];
//		
//	}
//	System.out.println(sum);
	for (int i : a) {
		  sum = sum+i;
		
	}
	System.out.println(sum);
}
}
