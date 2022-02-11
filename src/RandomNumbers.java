import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args)
	{
		Random rand = new Random();
		
		int i = rand.nextInt(5) + 1;// 5 means it gives values from 0 to 4, if we need 5, add +1//
		
		System.out.println(i);

	}

}
