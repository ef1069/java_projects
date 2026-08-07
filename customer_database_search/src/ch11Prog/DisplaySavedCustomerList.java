package ch11Prog;
import java.io.*;

public class DisplaySavedCustomerList {
	public static void main(String[]args) throws FileNotFoundException, IOException {
	String filepath="customers.txt";
	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
}
}
	}
}
