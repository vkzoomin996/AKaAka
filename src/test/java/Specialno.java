
public class Specialno {
	public static void main(String[] args) {
		int num = 145, sum = 0, rem = 0, temp = num;
		while (num > 0) {
			int fact = 1;

			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("its a spcial no" + sum);

		} else {
			System.out.println("its  not a spcial no" + sum);

		}
			 }
	}


