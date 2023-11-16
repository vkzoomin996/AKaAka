package java_interview;
import java.util.ArrayList;
import java.util.HashSet;

import org.testng.annotations.Test;

	public class Interview_Imp_Programs {
		
		@Test
		public void hjghj() {
			String str="jsvs,selenium,testng,maven";
			String[] s = str.split(" ");
			System.out.println(s);
			
			
		}
			@Test
		
		public void PrintCountofParticularStringCharac() {
			String s="Immunuities";
			String s1=s.toLowerCase();
			int count =0;
			for(int i=0;i<s1.length();i++) 
			{
				if(s1.charAt(i)=='u') 
				{
					count++;
					System.out.println(s1.charAt(i));
				}
			}
			System.out.println(count);
		}
		
		/**
		 * output should be like aaabbcdd
		 */
		@Test
		public void FetchCharactersstring() {
			String str = "a3b2c1d2";
			for (int i = 0; i<str.length();i=i+2) 
			{
				for(int j=0;j<str.charAt(i+1)-48;j++)
				{
					System.out.print(str.charAt(i) );
				}	
			}	
		}

		/**
		 * This method is used to add String into middle os existing String Array
		 */
		@Test
		public void AddStringIntoMIddleOfExistingStringArray() {
			String[] str = { "That", "good!","quality","king"};
			int size =str.length/2;
			
			ArrayList<String > ar = new ArrayList<String>();
		      for(int i=0;i<str.length;i++) 
		      {
		    	  ar.add(str[i]);
		      }
		      ar.add(size, "very");
		      System.out.println(ar);  
		}
		
		/**
		 * This method is used to print the repeated characters in a string
		 */
		@Test
		public void PrintRepeatingCharactersInword() {
			String [] s= {"Application","Append","App"};
			String s1="";
			for(int i=0;i<s[0].length();i++) 
			{
				boolean flag=true;
			    for(int j=1;j<s.length;j++) 
				{
					if(!s[j].contains(s[0].charAt(i)+""))
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					s1=s1+s[0].charAt(i);
				}
			}
			System.out.println("The common letters are:"+s1);
		}
		
		@Test
		public void PrintRepeatingCharactersInword1() {
			String [] s= {"bcapp","apple","licappation","apply"};
			String s1=" ";
			for(int i=0;i<s[0].length();i++) 
			{
				boolean flag=true;
			    for(int j=1;j<s.length;j++) 
				{
					if(!s[j].contains(s[0].charAt(i)+""))
					{
						flag=false;
						break;
					}
				}
				if(flag) 
				{
					s1=s1+s[0].charAt(i);
				}
			}
			System.out.println("The common letters are:"+s1);
		}
		
		@Test 
		public void StringPro() {
			String s="i love india";
			String st =s.replace(" ", "");
			String rev=" ";
			for(int i=st.length()-1;i>=0;i--) 
			{
				rev =rev+st.charAt(i);
			}
			//System.out.println(rev);
			for(int i=0;i<rev.length();i++) 
			{
				if(i==1||i==5) 
				{
					System.out.print(rev.charAt(i)+" ");
				}
				else 
				{
					System.out.print(rev.charAt(i));
				}
				
			}
		}
		@Test
		public void stringCharCountAlongWithDuplicates() {
			
		 	String str="aabbabc";//Output -a2b2a1b1c1
			for(int i=0;i<str.length();i++)
			{
				int count =0;
				for(int j=1;j<str.length();j++) 
				{
					if(str.charAt(i)==str.charAt(j)) 
					{
						count++;
					}
				}
				System.out.print(str.charAt(i)+ ""+ count);
			}
		}
		
		@Test
		public void PrintUniqueCharInStringInAscendingOrder() {
			String s="Apple";
		    char st[]=s.toCharArray();
		    HashSet<Character> hs = new HashSet<Character>();
			for(int i=0;i<st.length;i++)
			{
				hs.add(st[i]);
			} 
			for (Character ch : hs) 
			{
				int count =0;
				for(int j=0;j<st.length;j++)
				{
					if(ch==st[j]) 
					{
						count++;
					}	
				}
				if(count==1)
				{
				System.out.println(ch);	
				}
	     	}
		}
		@Test
		public void AddPrintUniqueWordInString(){
			String s="Iam from banglore";
			String s1=" Iam from delhi";
			String s2=s.concat(s1);
			
			System.out.println(s2);
			String str[]=s2.split(" ");
			HashSet<String> hs=new HashSet<String>();
			for(int i=0;i<str.length;i++)
			{
				hs.add(str[i]);
			}
			System.out.println(hs);
	        for (String st : hs) 
	        {
	        	int count =0;
	        	for(int i=0;i<str.length;i++)
	    		{
	    		if(st.equals(str[i])) 
	    		{
	    			count++;
	    		}
	    	   }
	    		if(count==1)
	    		{
	    			System.out.println(st);
	    			}
	    		}	
		   
		

	  
