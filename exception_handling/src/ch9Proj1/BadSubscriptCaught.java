package ch9Proj1;
import java.util.Scanner;

public class BadSubscriptCaught {
	{try(Scanner inputDevice=new Scanner(System.in)){
	String [] names={"Jack", "John", "Matthew", "Zach", "Tyler", "Ben", "Ethan", "Gordon"};
	System.out.println("Please enter an integer between 0 and 7 to print a name in the list");
	int entry=inputDevice.nextInt();
	try {
		System.out.println(names[entry]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("The number you entered does not correspond to a name in the list.");
	}
	
}
}
}
