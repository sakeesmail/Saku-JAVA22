import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		scan.close();
		if (num > 0) {
			System.out.println("It is a positive number");
		}

		else if (num == 0) {
			System.out.println("It is a Zero");
		} else

		{
			System.out.println("It is a negative number");
		}

	}

}
