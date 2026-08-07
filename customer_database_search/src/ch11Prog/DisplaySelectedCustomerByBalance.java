package ch11Prog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomerByBalance {public static void main(String[]args) throws FileNotFoundException, IOException {
	try(Scanner inputDevice=new Scanner(System.in)){
		 System.out.println("Enter the balanced owed you wish to look up:");
	     double search= inputDevice.nextDouble();
	     String filepath="customers.txt";
	     try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
	         String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] data = line.split(",");
	                Double findowed = Double.parseDouble(data[3].trim());
	                
	                if (findowed >= search) {
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

