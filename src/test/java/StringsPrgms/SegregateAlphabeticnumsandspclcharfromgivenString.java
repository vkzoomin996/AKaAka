package StringsPrgms;

import org.testng.annotations.Test;

public class SegregateAlphabeticnumsandspclcharfromgivenString {
	
@Test
	public void SegregateAlphabeticnumsandspclcharfromgivenString() {
String s="a1b2%c@3";//abc 123 %@
String apha=" ";
String num=" ";
String special=" ";
for (int i = 0; i < s.length(); i++) {
	char st=s.charAt(i);
	if(st>='A'&& st<='Z' ||st>='a'&& st<='z') {
		apha=apha+st;
	}else if(st>='0'&& st<='9') {
		num=num+st;
	}else {
		special=special+st;
	}
	
}
System.out.println(apha+" "+num +"  "+special);}}