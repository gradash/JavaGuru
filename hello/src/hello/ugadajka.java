package hello;

import java.util.Scanner;

public class ugadajka {

	public static void main(String[] args) {

		int min = 0;
		int max = 100;
		Scanner userAnswer = new Scanner(System.in);
	
		int guess = (int) (Math.random() * 100);
		System.out.println("Your number is " + guess + "?");
		System.out.print("m(More), l(Less), y(Yes) ? : ");
		while (true) {
			char answer = userAnswer.nextLine().charAt(0);
			System.out.println("Your number is " + guess + "?");
			System.out.print("m(More), l(Less), y(Yes) ? : ");

			if (answer == 'l') {

				max = guess;
				guess = guess - (max - min);
				System.out.println("Your number is " + guess + "?");
				System.out.print("m(More), l(Less), y(Yes) ? : ");

			}

			else if (answer == 'm') {
				min = guess;
				guess = guess + (max - min);
				System.out.println("Your number is " + guess + "?");
				System.out.print("m(More), l(Less), y(Yes) ? : ");

			}
			else if (answer == 'y') {
				System.out.println("Я угадал !");
			}
		}
				
		

	}

}
