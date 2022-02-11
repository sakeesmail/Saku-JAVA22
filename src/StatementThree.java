import java.util.Scanner;

public class StatementThree {

	public static <moduleAssignment> void main(String[] args) 
		{
			int id[] = new int[5];
			double salary[] = new double[5];
			String name[] = new String[5];
			
			//Accepting data...
		 
			Scanner sc = new Scanner (System.in);
			 
			
	 
		for (int i = 0;  i < 5; ++i)
		{
		   System.out.println("Enter employee record in ID Name salaray format...");
			id[i] = sc.nextInt();
			name[i]= sc.next();
			salary[i] = sc.nextDouble();
	
		moduleAssignment m1 = new moduleAssignment();
		m1.display(id, salary, name);
		System.out.println();
		
		m1.display(id, name);
		
		System.out.println("Enter a name to search for...");
		String searchName = sc.next();
		m1.display(searchName, id, name, salary);
		
	}

		}
}
	
		
			
	

	
