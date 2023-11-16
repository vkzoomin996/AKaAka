package java_interview;

import java.util.HashSet;

import org.testng.annotations.Test;

public class EXC {
	@Test
	public void hjghj() {
		String str="jsvs,selenium,testng,maven";
		String[] s = str.split(",");
		for (String string : s) {
			System.out.println(string);
			
		}
 	}
	@Test
	   public void aaana() {  
 			String [] s= {"Application","Append","App","raAappa"};
 			String s1="";
 			for (int i = 0; i <s[0].length(); i++) {
 				boolean flag=true;
 				for (int j = 1; j < s.length; j++) {
 					if(!s[j].contains(s[0].charAt(i)+"")) {
 						flag=false;
 						break;
 					}
 				}
 				if(flag) {
 					s1=s1+s[0].charAt(i);
 				}

 			}
			System.out.println(s1);
 			
 			} 
 				
 					 
				
			

	        
	}
   class CharacterCount {
	   @Test
	   public void aaaa() {
         String str = "aaabbcddeccfff";
        String result = "";
         char currentChar = str.charAt(0);
        int count = 0;
         for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                result=result+(currentChar)+count ;
                currentChar = str.charAt(i);
                count = 1;
            }
        }
         result=result+(currentChar)+count;
        System.out.println(result);
     }
	   @Test
	   public void teckon() {
		   String s="tekon123";
		  String ss = s.replaceAll("[^a-z]", "");
		  System.out.println(ss);
	   }
	   @Test
	   public void teckon1() {
		   int [] a={20,10,30,50,10,20,40};
		   HashSet<Integer> a1= new   HashSet<Integer>();
		   for (int i = 0; i < a.length; i++) {
			   a1.add(a[i]);
			
		}
		   for (Integer aaa : a1) {
			   int count=0;
			   for (int i = 0; i < a.length; i++) {
				   if(aaa==a[i]) {
					   count++;
					   
				   }
				
			}
			   if(count>1)
			   System.out.println(aaa+"is repeating "+count+"times");
			
		}
		   
		   
	   }
	  
	   
}
   




