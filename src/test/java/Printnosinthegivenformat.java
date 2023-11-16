import org.testng.annotations.Test;

public class Printnosinthegivenformat {
@Test
public void printnosinthegivenformat() {
	//1  3  7  15  31  63  127
	int n=1;
	for (int i = 0; i <=6 ; i++) {
		System.out.print(n+" ");
		n=(n*2)+1;
		//n=(1*2)+1=3
		//n=(3*2)+1=7
		//n=(7*2)+1=15
		//n=(15*2)+1=31
		//n=(31*2)+1=63
		//n=(63*2)+1=127



		
	}
}
}
