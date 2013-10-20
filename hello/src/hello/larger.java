package hello;
import java.util.Scanner;

public class larger {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.print("Enter A number: ");
		int a = in.nextInt();
		System.out.print("Enter B number: ");
		int b = in.nextInt();
		System.out.print("Enter C number: ");
		int c = in.nextInt();

		if ((a > b) && (a > c)) {
			System.out.println("Number A larger");
		} else if ((b > a) && (b > c))
			System.out.println("Number B larger");
		else if ((c > a) && (c > b))
			System.out.println("Number C larger");
		
		
		else if ((a < c) && (c == b))
			System.out.println("Numbers B & C larger than A");
		else if ((b < a) && (a == c))
			System.out.println("Numbers A & C larger than B");
		else if ((c < b) && (b == a))
			System.out.println("Numbers A & B larger than C");
		else if ((a == b) || (b == c))
			System.out.println("All numbers equal!");

	}
}