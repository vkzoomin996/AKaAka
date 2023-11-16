package Javapack;

 
 
public class Reversee {
	
	public static String rev(String s1) {
 		String  rev="";
		for (int i = s1.length()-1; i >=0;  i--) {
			rev=rev+s1.charAt(i);
		}
 		return rev;
	}
	
	public static void main(String[] args) {
		String s1="reverse";

		System.out.print(rev(s1));
	}
	}

