
public class Perfectno {
	public static void main(String[] args) {
		int num = 6, sum = 0;

		for (int i = 1; i <num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(" its a perfect no");

		} else {
			System.out.println(" its  not a perfect no");

		}
	}

}
