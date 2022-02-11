import java.util.Scanner;

public class DoWhileFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		{
			System.out.println("Enter a natural number");
		}
		int n = scan.nextInt();
		scan.close();
		int i = 1, fact = 1;
		do {
			fact = fact * i;
			i++;
		} while (i <= n);

		System.out.println(fact);

	}

}
