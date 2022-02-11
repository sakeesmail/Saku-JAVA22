import java.util.Scanner;

public class EvenOddNumber {

		public static void main(String[] args) {
				Scanner Scan= new Scanner(System.in);
				{System.out.println("Please enter a number");}
				int num=Scan.nextInt();
				Scan.close();
			
		
				
				if (num%2==0)
				{
					System.out.println("The number is an Even number");
				}
				else
				{
					System.out.println("The number is an Odd number");
				}
				


	}

}
