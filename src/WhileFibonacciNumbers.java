
public class WhileFibonacciNumbers {

public static void main(String[] args) {
		
		int n,a=1,b=1;
		n=0;
		{
			System.out.print("1 1 ");
		}
		
	while(n<=50)
		{
		n=a+b;
	    System.out.print(n+ " ");
		a=b;
		b=n;
		}
			
	}
	}