package ch2Proj1;

import java.util.Scanner;
public class QuartsToGallonsInteractive {
	public static void main(String[] args)
	{try (Scanner inputDevice = new Scanner(System.in)) {
		System.out.println("How many quarts are needed?");
		int quarts_needed = inputDevice.nextInt();
		final int quarts_to_gallons=4;
		int gallons_needed=quarts_needed/quarts_to_gallons;
		int remainder=quarts_needed%quarts_to_gallons;
		System.out.print(gallons_needed);
		System.out.print(" gallons and ");
		System.out.print(remainder);
	}
	System.out.print(" quarts are needed");
	}

	}
