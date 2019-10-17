package co.grandcircus;

import java.util.Scanner;

/*
 * @author : Adam Graff
 */

public class Lab4 {

	public static void main(String[] args) {

		int userInt;
		String contQuest;
		Scanner scan = new Scanner(System.in);

		System.out.println("Learn your squares and cubes!");
		do {
			System.out.println();
			System.out.print("Enter an integer: ");
			userInt = scan.nextInt();

			System.out.println();
			System.out.printf("%-10s  %-12s  %-14s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s  %-12s  %-14s\n", "=======", "=======", "======");

			for (int currentNum = 1; currentNum <= userInt; currentNum++) {
				int square = currentNum * currentNum;
				int cube = square * currentNum;
				System.out.printf("%-10s  %-12s  %-14s\n", currentNum, square, cube);
				System.out.println();
			}

			System.out.print("Continue? (y/n)");
			contQuest = scan.next();

		} while (!contQuest.equalsIgnoreCase("N"));
		System.out.println();
		System.out.println("Goodbye!");
		
		scan.close();
	}

}
