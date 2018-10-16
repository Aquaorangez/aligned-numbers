package edu.sbcc.cs105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AlignedNumbers demo = new AlignedNumbers();
		Scanner s = new Scanner(System.in);
		
		System.out.printf("Input first number: ");
		int first = s.nextInt();
		
		System.out.printf("Input second number: ");
		int second = s.nextInt();
		
		demo.setFirstNumber(first);
		demo.setSecondNumber(second);
		demo.printStats();
		
		s.close();
		
	}

}
