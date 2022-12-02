package com.cognixia.jump;

import java.lang.reflect.Array;
import java.util.Arrays;

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
	}
	
	

}
