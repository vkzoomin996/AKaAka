package Javapack;

 
public class Printno1to10 {
	public static void printnumbers(int a) {
		 if(a>1) {
			 printnumbers(a-1);
		 }
		 System.out.println(a);
	}
	public static void main(String[] args) {
		printnumbers(20);
	}
}
