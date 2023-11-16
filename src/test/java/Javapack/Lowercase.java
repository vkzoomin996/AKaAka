package Javapack;

public class Lowercase {
	public static void main(String[] args) {
		
	
  	String[] a= {"ABCDEFGHIJ"};//abcdeJIHGF
   char ch[]=a[0].toCharArray();
    	  	 //int length = a[0].length()/2;
  	for (int i = 0; i < ch.length/2; i++) {
  		System.out.print(Character.toLowerCase(ch[i]));
		
	}
  	for (int i = ch.length-1; i >=ch.length/2; i--) {
  		System.out.print(ch[i]);
		
	}
  	
      	 }
  	
} 