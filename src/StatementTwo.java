
public class StatementTwo {

	public static void main(String[] args) {
		int id []= new int[5];
		String name []= new String[5];
		double salary[]= new double[5];
		id[0] = 00;
		id[1] = 002;
		id[2] = 003;
		id[3] = 004;
		id[4] = 005;
		name[0]= "John ";
		name[1]= "Clark";
		name[2]= "Nancy";
		name[3]= "Joe  ";
		name[4]= "Mary ";
		salary[0]= 600000;
		salary[1]= 550000;
		salary[2]= 500000;
		salary[3]= 500000;
		salary[4]= 300000;
		
		System.out.print(" \n\n\t ID "+ "             "+ "Name" +"       ");
		System.out.println("\n\n--------------------------------------\n");
		
		int length= id.length;
		int i=0;
		for(i=0;i<5;++i) {
		System.out.println("\n\t"+ id[i]+"                "+ name[i]+ "      ");
		}
	}
		
}



