package ch3Proj1;

import java.util.Scanner;

public class Ch3Proj1 {
	public static void main(String[] args)
	{try(Scanner inputDevice=new Scanner (System.in)) {
	System.out.println("Please enter your name:");
	var studentName= inputDevice.next();
	System.out.println("Please enter your gpa:");
	double studentGPA= inputDevice.nextDouble();
	double credit= studentGPA * 10;
	System.out.print("Student Name: ");
	System.out.println(studentName);
	System.out.print("Your GPA is: ");
	System.out.println(studentGPA);
	System.out.print("Your library credit is $");
	System.out.print(credit);
	}
	}
}
