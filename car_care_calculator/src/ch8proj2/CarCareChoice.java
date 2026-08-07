package ch8proj2;
import java.util.Scanner;

public class CarCareChoice {
	public static void main(String[]args) {
		try(Scanner inputDevice=new Scanner(System.in)){
			String [] operation= {"oil change", "tire rotation", "battery check","brake inspection"};
			int [] price= {25,22,15,5};
			System.out.print("Enter what you need done to your vehicle from the following list: ");
			for(int i=0;i<4; i++)
				System.out.print(operation[i]+", ");
			
			System.out.println();
			String choice=inputDevice.nextLine();
			
			if (choice.equals(operation[0])) 
				System.out.print("You have chosen an oil change, it will cost: $"+price[0]);
			if (choice.equals(operation[1])) 
				System.out.print("You have chosen a tire rotation, it will cost: $"+price[1]);
			if (choice.equals(operation[2])) 
				System.out.print("You have chosen a battery check, it will cost: $"+price[2]);
			if (choice.equals(operation[3]))
				System.out.print("You have chosen a brake inspection, it will cost: $"+price[3]);
			else
				System.out.print("You have entered an incorrect input, please try again.");
		
		}
	}

}
