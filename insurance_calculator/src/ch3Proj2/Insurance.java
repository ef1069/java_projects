package ch3Proj2;

import java.util.Scanner;

public class Insurance {
	public static void main(String[]args) 
		{try(Scanner inputDevice=new Scanner(System.in)){
		System.out.println("Please enter the year you were born:");
		int yearBorn=inputDevice.nextInt();
		System.out.println("Please enter the current year");
		int currentYear= inputDevice.nextInt();
		System.out.print("Your insurance premium for this year will be: $");
		System.out.println(decade(yearBorn,currentYear));
		}
		}
	public static int decade(int x, int y) {
		int yearsOld= x-y;
		int a=yearsOld/10;
		int b=a+15;
		int c=b*20;
		return c;
	}
}

