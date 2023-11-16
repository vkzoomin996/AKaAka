package StringsPrgms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CountTheNOfvowelInAStringWithDuplicate {
@Test
public void  countTheNOfvowelInAStringWithDuplicate() {
	String s="India";
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		
	
	char ch=s.charAt(i);
  	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		count++;
		System.out.println(ch);
	}
 }
	System.out.println(count);

}
@Test
public void  countTheNOfvowelInAStringWithDuplicateScanner() {
	Scanner sc = new Scanner(System.in);
	String st =sc.next();
	char[] s = st.toCharArray();
 	int count=0;
	for (int i = 0; i< s.length; i++) {
		if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U') {
count++;
System.out.println(s[i]);
		}
	}
	System.out.println(count);
		
	}
}

