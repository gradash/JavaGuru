package hello;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner scan;

	public static void main(String args[]) {

		int c = 0; // kolichestvo chetnih
		int b = 0; // kolichestvo nechetnih
		int n;

		System.out.println("Введите числа, чтобы закончить - введите 0: ");
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

		System.out.println("Четных " + c);
		System.out.println("Нечетных " + b);
	}
}
