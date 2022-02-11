
public class DoWhileFibonacciNumbers {


		public static void main(String[] args) {

			int n=1, a = 1, b = 1;
			System.out.print("1 1 ");

			do { n = (a + b);
				
				System.out.print(n+ " ");
				a = b;
				b = n;
			}
			while (n>0);

		}
}
