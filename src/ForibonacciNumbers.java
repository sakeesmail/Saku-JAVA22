import java.util.Scanner;

public class ForibonacciNumbers {

	public static void main(String[] args) {

		int n, a = 1, b = 1;
		System.out.print("1 1 ");

		for (n = 1; n >= 1; n = a + b) {
			n = (a + b);
			System.out.print(n+" ");
			a = b;
			b = n;
		}

	}
}
