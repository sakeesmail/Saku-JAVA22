import java.util.Scanner;

public class WhileFactorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		{
		System.out.println("Enter a natural number");
		}
		int n = scan.nextInt();
		scan.close();
		int i=1, factorial=1;
		while (n>=i)
		{factorial=factorial*i;
			i++;}
		System.out.println(factorial);
		
		

	}
}

