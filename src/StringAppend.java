
public class StringAppend {
	public static void main (String args[])
	{
		StringBuffer str1 = new StringBuffer ("Hello");
		StringBuffer str2 = new StringBuffer (" World");

		str1.append(str2);
		System.out.println("\n\n Appended string is : "+str1);		
	}
}

