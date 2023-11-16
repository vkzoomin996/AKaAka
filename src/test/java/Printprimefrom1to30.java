import org.testng.annotations.Test;

public class Printprimefrom1to30 {
	@Test
	public void printprimefrom1to30() {
		int num=30;
		for (int i = 1; i <= num; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
				}if(count==2) {
					System.out.println(i);
				
				
			}
			
		}
	}}