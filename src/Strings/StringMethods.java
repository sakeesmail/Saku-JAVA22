package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str ="edureka tech";
		System.out.println("length() of string(size).... "+str.length());
		System.out.println("charat().." + str.charAt(0));
		System.out.println("charat().." + str.charAt(11));
		//System.out.println("charat().." + str.charAt(13));
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
		//String index out of range: 12
		System.out.println("IndexOf().." + str.indexOf('e'));
		System.out.println("indexOf() e from 3.." + str.indexOf('e',3));
		System.out.println("lastIndexOf() e .." + str.lastIndexOf('e'));
		System.out.println("indexOf()java.." + str.indexOf("java"));//if string not there gives -1;
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println (str);
		System.out.println(str.replace('e','$'));
		str ="     java is a programming language used for developing plantform independent apps         ";
				
				String words[]= str.split(" ");
		System.out.println("no of words in string is...."+ words.length);
		System.out.println(Arrays.toString(words));
		System.out.println(str.trim());
		str.reverse();
		System.out.println(str);

	}

}
