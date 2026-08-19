package ch2Proj2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ch2Proj2 {
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue()*100;
	}
	
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
	System.out.print(round(vote_percentage1,4));
	System.out.println("% of all votes");
	System.out.print(political_party2);
	System.out.print(" party received ");
	System.out.print(round(vote_percentage2,4));
	System.out.println("% of all votes");
	System.out.print(political_party3);
	System.out.print(" party received ");
	System.out.print(round(vote_percentage3,4));
	System.out.println("% of all votes");
	}
			
	}
}
