package ch5Proj1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[]args) 
	{try(Scanner inputDevice=new Scanner(System.in)){
		System.out.println("Please enter an integer:");
		int num=inputDevice.nextInt();
		if(evenOdd(num)==true)
			System.out.print("Number is even.");
		if(evenOdd(num)==false)
			System.out.print("Number is odd");	
	}
	}
	public static boolean evenOdd(int x) {
		if(x % 2<=0)
			return true;
		else
			return false;
	}

}