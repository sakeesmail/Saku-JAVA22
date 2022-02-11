import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		scan.close();
		if (age >=18) 
		{
			System.out.println("You are eligible to vote!");
		}
		else	
		{
			int shortByAge= 18-age;
			System.out.println("You are not eligible to vote right now "
					+ "but you can come after " + shortByAge + " years");
		}
		
	}

}
// Program to check if the number is positive or negative


