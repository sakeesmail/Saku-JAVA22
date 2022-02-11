import java.util.Scanner;

public class WhileAddDigitsOfANumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		{
			System.out.println("Enter a four digit number");
		}
		int n = scan.nextInt();
		scan.close();
		int rem=0,sum=0;
		while (n>0)
		{ 
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);
		}
		

	}

