package Javapack;

public class Largest_among_3_no {
	public static void main(String[] args) {
		int a=10 , b=20, c=40;
		//by using ternary operations
		int largest = a>b?a:b;
		int llargest = largest>c?largest:c;
		System.out.println(llargest);
	}

}
