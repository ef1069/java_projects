package ch2Proj2;

import java.util.Scanner;

public class Ch2Proj2 {
	public static void main(String[] args)
	{try(Scanner inputDevice= new Scanner(System.in)) {
	System.out.println("Please enter the name of political party 1:");
	var political_party1 = inputDevice.next();
	System.out.println("Please enter the name of political party 2:");
	var political_party2 = inputDevice.next();
	System.out.println("Please enter the name of political party 3:");
	var political_party3 = inputDevice.next();
	System.out.println("Please enter the amount of votes that the member of political party 1 received");
	double votes_received1 = inputDevice.nextInt();
	System.out.println("Please enter the amount of votes that the member of political party 2 received");
	double votes_received2 = inputDevice.nextInt();
	System.out.println("Please enter the amount of votes that the member of political party 3 received");
	double votes_received3 = inputDevice.nextInt();
	double total_votes= votes_received1+votes_received2+votes_received3;
	double vote_percentage1= votes_received1/total_votes;
	double vote_percentage2= votes_received2/total_votes;
	double vote_percentage3= votes_received3/total_votes;
	System.out.print(political_party1); 
	System.out.print(" party received ");
	System.out.print(vote_percentage1);
	System.out.println(" percent of all votes");
	System.out.print(political_party2);
	System.out.print(" party received ");
	System.out.print(vote_percentage2);
	System.out.println(" percent of all votes");
	System.out.print(political_party3);
	System.out.print(" party received ");
	System.out.print(vote_percentage3);
	System.out.println(" percent of all votes");
	}
			
	}

}
