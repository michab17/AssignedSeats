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
		String name = userInputForName();
		
		System.out.println("The seat you chose was:\n" + "Row " + seat[0] + " " + "Seat " + seat[1] + "\nWith the name: " + name + "\n");
		
		theater[seat[0]][seat[1]] = 'X';
		
		printTheater(theater);
		
		

	}
	
	public static void printTheater(char arr[][]) {
		System.out.println("============");
		System.out.println("SEATS");
		System.out.println("============\n");
		System.out.println("   1  2  3  4  5");
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
		
		int rowInt = input.nextInt();
		
		result[0] = (rowInt - 1);
		
		System.out.println("Col:");
		
		int colInt = input.nextInt();
		
		result[1] = (colInt - 1);
		
		//input.close();
		
		return result;
	}
	
	public static String userInputForName() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a name for the seat: ");
		
		String name = input.nextLine();
		
		input.close();
		
		return name;
	}
	
}
