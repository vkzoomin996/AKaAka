
public class Findthefactorsofgivenno {
	public static void main(String[] args) {
		int num = 15;
		System.out.println("the factors are");
		for (int i = 1; i <= 15; i++) {

			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}
}