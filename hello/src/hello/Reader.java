package hello;

import java.util.Scanner;

public class Reader {
	int i;
	int k;

	public void Scan() {
		System.out.println("Enter first number: ");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		System.out.println("Enter second number: ");
		k = scn.nextInt();
	}
}
