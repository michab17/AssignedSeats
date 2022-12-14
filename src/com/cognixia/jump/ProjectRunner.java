package com.cognixia.jump;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectRunner {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char theater[][] = { { 'O', 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O', 'O' } };

		printTheater(theater);

		int[] seat = userInputForSeat();
		String name = userInputForName();

		System.out.println("The seat you chose was:\n" + "Row " + seat[0] + " " + "Seat " + seat[1]
				+ "\nWith the name: " + name + "\n");

		theater[seat[0]][seat[1]] = 'X';

		printTheater(theater);

		boolean bool = true;

		while (bool == true) {
			if (userInputMoreSeats() == 'y') {
				seat = userInputForSeat();
				name = userInputForName();

				if (theater[seat[0]][seat[1]] == 'X') {
					System.out.println("That seat is already taken. Please choose a different one.");
					continue;
				}

				else {

					System.out.println("The seat you chose was:\n" + "Row " + seat[0] + " " + "Seat " + seat[1]
							+ "\nWith the name: " + name + "\n");

					theater[seat[0]][seat[1]] = 'X';

					printTheater(theater);
				}
			}

			else {
				bool = false;
			}
		}

		input.close();

	}

	public static void printTheater(char arr[][]) {
		System.out.println("============");
		System.out.println("SEATS");
		System.out.println("============\n");
		System.out.println("   1  2  3  4  5");
		System.out.println("  --------------");

		for (int row = 0; row < arr.length; row++) {

			System.out.print((row + 1) + "|");

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(" " + arr[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
	}

	public static int[] userInputForSeat() {
		int[] result = new int[2];

		System.out.println("Which seat would you like to reserve");

		System.out.println("Row:");

		while (true) {
			try {
				int rowInt = input.nextInt();
				
				while (rowInt > 5) { 
					System.out.println("Please enter a number from 1 to 5");
					rowInt = input.nextInt();
					
				}
				
				result[0] = (rowInt - 1);
	
				System.out.println("Col:");

				int colInt = input.nextInt();
				while (colInt > 5) {
					System.out.println("Please enter a number from 1 to 5");
					colInt = input.nextInt();
				}
				
				result[1] = (colInt - 1);
	
				return result;
				
			} catch (InputMismatchException e) { 
				input.next();
				System.out.println("Please enter a number from 1 to 5");
				System.out.println("Row:");
			}
		}

	}

	public static String userInputForName() {
		System.out.println("Please enter a name for the seat: ");

		input.nextLine();

		String name = input.nextLine();

		return name;
	}

	public static char userInputMoreSeats() {
		boolean bool = true;

		System.out.println("Would you like to select another seat (y/n): ");

		while (bool == true) {

			String decision = input.nextLine().toLowerCase();

			if (decision.equals("y")) {

				return 'y';

			} else if (decision.equals("n")) {

				return 'n';
			} else {
				System.out.println("Please enter y or n.");
			}
		}

		return ' ';
	}

}
