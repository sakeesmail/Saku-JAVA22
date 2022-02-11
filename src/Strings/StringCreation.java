package Strings;

public class StringCreation {

	public static void main(String[] args) {
		String s1="Saku";
		String s2="Saku";
		String s3=new String("Chundru");
		String s4=new String("chundru");
		
		//if we create 2 strings with same data it will not create a separate memory;
		//memory is same
				System.out.println("s1 and s2 is having same memory " + (s1==s2));
				System.out.println("s3 and s4 is having different memory "+  (s3==s4));
				s1= s1.concat("DEVI");//
				System.out.println(s1);
				System.out.println("equals() ..."+ s3.equals(s4));
				System.out.println("contentequals()...." + s3.contentEquals(s4));
				System.out.println("equalsIgnoreCase()....." + s3.equalsIgnoreCase(s4));
				
				
				
	}

}
