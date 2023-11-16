package Javapack;

public class Revrese {
	static public void main(String[] args) {
		int num = 1243;
//1
//StringBuffer sb=new StringBuffer(String.valueOf(num));
//StringBuffer rev = sb.reverse();

//System.out.println(rev);

//2
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}
}
