import java.util.Scanner;

public class DoWhileToAddDigitsOfANumber {


		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			
			{
				System.out.println("Enter a four digit number");
			}
			int n = scan.nextInt();
			scan.close();
			int rem=0,sum=0;
			do { 
				rem=n%10;
				sum=sum+rem;
				n=n/10;}
			
			while (n>0);
			
			System.out.println(sum);
			}
			

		}
