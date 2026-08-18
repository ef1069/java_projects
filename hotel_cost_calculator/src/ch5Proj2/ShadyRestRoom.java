package ch5Proj2;

import java.util.Scanner;

public class ShadyRestRoom {
	public static void main(String[]args) {
		try(Scanner inputDevice=new Scanner(System.in)){
			System.out.println("Please enter the type of room you would like (1 for queen size bed, 2 for king size bed, 3 for king size and a pullout couch:");
			int room=inputDevice.nextInt();
			int price=0;
			System.out.print("The cost of your room will be: $");
			int initcost=roomCost(room,price);
			System.out.println(initcost);
			System.out.println("Please enter 1 if you would like a lake view, please enter 2 if you would like a park view:");
			int view=inputDevice.nextInt();
			System.out.print("The total cost of your room will be: $");
			System.out.print(total(view,initcost));
			}}
		public static int roomCost(int x, int y) {
			if (x==1)
				return y=125;
			else if (x==2) 
				return y=139;
			else if (x==3)
				return y=165;
			else {
				System.out.print("You have entered an incorrect number.");
				return y =0;
		}
		}
		public static int total(int x, int y) {
			if(x==2)
				return y;
			else
				return y+15;
		}
			
		
	}
