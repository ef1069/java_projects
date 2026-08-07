package countByFives;

import java.util.Scanner;

public class CountByAnything {
	public static void main(String[]args) {
		try(Scanner inputDevice=new Scanner(System.in)){
		System.out.println("Where would you like to start your count?");
		int start=inputDevice.nextInt();
		System.out.println("Where would you like to stop your count?");
		int stop=inputDevice.nextInt();
		System.out.println("What would you like to count by");
		int count=inputDevice.nextInt();
		int iteration=0;
		while(start<=stop) {
			System.out.print(start+ ", ");
			start+=count;
			iteration++;
			if(iteration % 10==0) {
				System.out.println();
			}
		}
		
		}
				
	}

}
