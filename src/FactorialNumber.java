import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		{
			System.out.println("Enter a natural number");
		}
		int n = scan.nextInt();
		scan.close();
		int i, factorial=1;
		for (i = 1;i<=n; i++) 
		{ 
			factorial=factorial*i;
		}
		System.out.println(factorial);
		}
		

	}


