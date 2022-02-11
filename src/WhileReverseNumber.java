import java.util.Scanner;

public class WhileReverseNumber {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		{
			System.out.println("Enter a three digit number");
		}
		int n = scan.nextInt();
		scan.close();
		int rem=0,rev=0;
		while (n>0)
		{ 
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println(rev);
	}
}
	
