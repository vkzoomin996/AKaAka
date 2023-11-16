import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// char grade='A';
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		switch (grade) {
		case 'A':
			System.out.println("first class");
			break;
		case 'b':
			System.out.println("2nd class");
			break;
		case 'c':
			System.out.println("3rd");
			break;
		case 'd':
			System.out.println("fail  ");
			break;

		default:
			System.out.println("invalid input");
			break;
		}
	}

}
