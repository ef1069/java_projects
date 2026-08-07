package ch11Prog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomerByName {public static void main(String[]args) throws FileNotFoundException, IOException {
	try(Scanner inputDevice=new Scanner(System.in)){
		 System.out.println("Enter the last name of the customer you wish to look up:");
	     String search= inputDevice.nextLine();
	     String filepath="customers.txt";
	     try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
	         String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] data = line.split(",");
	                String findlast = data[2].trim();
	                
	                if (findlast.equals(search)) {
	                    int ID= Integer.parseInt(data[0].trim());
	                    String firstname = data[1].trim();
	                    String lastname = data[2].trim();
	                    double balanceowed = Double.parseDouble(data[3].trim());
	                    System.out.println("Customer Details:");
	                    System.out.println("ID: " + ID);
	                    System.out.println("First Name: " + firstname);
	                    System.out.println("Last Name: " + lastname);
	                    System.out.println("Balance Owed: " + balanceowed);
	                    break; // Exit the loop after finding the customer
	                }
	            }
	}
}

}

}
