package evenEntryLoop;

import java.util.Scanner;

public class EvenEntryLoop {
	public static void main(String[]args) {
		try(Scanner inputDevice=new Scanner(System.in)){
			int num=0;
			int endval=999;
			while(num!=endval) {
			System.out.println("Please enter an even number (Enter 999 to end program):");
			num=inputDevice.nextInt();
			if (num%2==0) {
				System.out.println("Good Job!");
			}
			if (num==endval) {
				System.out.print("Thank you, goodbye.");
			}
			if (num%2==1)
				System.out.println("Try again.");
		}
	}

}
}
