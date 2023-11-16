package Collection;

public class Static_poly_or_compile {
	static String  s="testyantra";
	public  static void  details(int tid, String sub) {
		System.out.println("welcome to "+s);
		System.out.println("your team id "+tid);
		System.out.println("your taking "+sub+"Subject");
		
	}
	public static void  details(int eid ,  int cclasss) {
		System.out.println("welcome to "+s);
		System.out.println("your   id "+eid);
		System.out.println("your taking "+cclasss+"class");
		
	}
	public static void main(String[] args) {
		int tid=10;
		String sub="jaava";
		int eid=25;
		int cclasss=15;
		
		Static_poly_or_compile sc=new Static_poly_or_compile();
		sc.details(eid, cclasss);
		sc.details(tid, sub);
		
	}
	

}
