package Javapack;

import org.testng.annotations.Test;

public class SEarch_ele_in_an_array {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6};
	int search_ele=5;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==search_ele) {
		System.out.println("ele found at index"+i);	
		}
	}
	
}
@Test
public void remove_space() {
	String ss=" iam  in d ia n s an d   u r";
	String sss = ss.replaceAll("\\s", "");
	System.out.println(sss);
}
@Test
public void countoccrence_char() {
	String ss=" iam  india n iiiiiiiis an d   u r";
	int count=0;
char p = 'i';
for (int i = 0; i < ss.length(); i++) {
	if(p==ss.charAt(i)) {
		count++;
	}
	
}
System.out.println(count);
	
}
@Test
public void count_of_words() {
	String s="iam india ns and ur";
 	int count=1;
 	for (int i = 0; i < s.length(); i++) {
 		if(s.charAt(i)==' ') {
			count++;
		}
		
	}
	System.out.println(count);
	
}
@Test
public void reverse_each_world_in_a_String() {
	String s = "Welcome to my world";
	String[] worlds = s.split(" ");
	String rev="";
	for (String world : worlds) {
		String revworld=" ";
		for (int i =world.length()-1 ; i >=0; i--) {
			revworld=revworld+world.charAt(i);
		}
		rev=rev+revworld+" ";

		
	}		System.out.println(rev);

	 
}
}
