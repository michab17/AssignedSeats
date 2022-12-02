package com.cognixia.jump;

import java.util.Scanner;

public class ProjectRunner {

	public static void main(String[] args) {
		
		char theater[][] = {
				{'O', 'O', 'O', 'O', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', 'O', 'O', 'O', 'O'},
				{'O', 'O', 'O', 'O', 'O'}
		};
		
		printTheater(theater);
		
		int[] seat = userInputForSeat();
		
		System.out.println("The seat you chose was:\n" + "Row " + seat[0] + " " + "Seat " + seat[1]);

	}
	
	public static void printTheater(char arr[][]) {
		System.out.println("============");
		System.out.println("SEATS");
		System.out.println("============\n");
		System.out.println("  1  2  3  4  5");
		System.out.println("  --------------");
		
		for(int row = 0; row < arr.length ; row++) {
			
			System.out.print((row + 1) + "|");
			
			for(int col = 0; col < arr[row].length; col++) {
			
				System.out.print(" " + arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
	}
	
	public static int[] userInputForSeat() {
		int[] result = new int[2];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which seat would you like to reserve");

		System.out.println("Row:");
		
		String rowString = input.nextLine();
		
		result[0] = Integer.parseInt(rowString);
		
		System.out.println("Col:");
		
		String rowColumn = input.nextLine();
		
		result[1] = Integer.parseInt(rowColumn);
		
		input.close();
		
		return result;
	}
	
}
