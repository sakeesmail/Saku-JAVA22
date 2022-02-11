import java.util.Scanner;

public class ForReverseTheDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		{
			System.out.println("Enter a three digit number");
		}
		int n = scan.nextInt();
		scan.close();
		int rem = 0, rev = 0;
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			rev = rev * 10 + rem;
		}

		System.out.println(rev);
	}

}
