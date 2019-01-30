package hello;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner scan;

	public static void main(String args[]) {

		int c = 0; // kolichestvo chetnih
		int b = 0; // kolichestvo nechetnih
		int n;

		System.out.println("hello world one more time");
		scan = new Scanner(System.in);

		while (true)

		{

			n = scan.nextInt();
			if (n == 0)
				break;
			if ((n % 2) == 0) {
				c++;
			} else
				b++;
		}

		System.out.println("hz 4to " + c);
		System.out.println("hz 4to 2 " + b);
	}
}
