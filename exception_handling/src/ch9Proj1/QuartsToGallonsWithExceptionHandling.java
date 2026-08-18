package ch9Proj1;
import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {
	{try(Scanner inputDevice=new Scanner(System.in)){
		try{System.out.println("Enter the number of quarts you would like to convert to gallons:");
		int input=inputDevice.nextInt();
		System.out.println("The number of gallons is:"+ calculation(input));
		System.out.println("The number of left over quarts is:"+remainder(input));
	}catch(NumberFormatException e) {
		System.out.println("Please enter an integer:");
	}
	}
	}
	public static int calculation(int x) {
		int y=x/4;
		return y;
	}
	public static int remainder(int x) {
		int y=x%4;
		return y;
	}
	
}