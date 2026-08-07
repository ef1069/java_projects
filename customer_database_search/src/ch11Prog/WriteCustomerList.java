package ch11Prog;
import java.util.Scanner;
import java.io.*;

public class WriteCustomerList {
	public static void main(String[]args) throws IOException
	{try(Scanner inputDevice=new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter(new FileWriter("customers.txt")))
		{
		System.out.println("How many customers are there?");
		int customercount=inputDevice.nextInt();
		inputDevice.nextLine();
		for (int i=0; i<customercount; i++) {
			System.out.println("Enter the customer's ID Number, first name, last name, and balance owed:");
			String entry=inputDevice.nextLine();
			String[] data=entry.split(",");
			int ID=Integer.parseInt(data[0]);
			String firstname=data[1].trim();
			String lastname=data[2].trim();
			double balanceowed=Double.parseDouble(data[3]);
			System.out.println(ID+", "+firstname+", "+lastname+", "+balanceowed);
			outputFile.println(ID+", "+firstname+", "+lastname+", "+balanceowed);
		}
		}
}
}
