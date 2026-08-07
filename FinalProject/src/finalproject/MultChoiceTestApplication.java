package finalproject;

import java.util.*;
import java.io.*;

public class MultChoiceTestApplication {

	public static void main(String[] args) {
		// Setup scanner for user input and random for random numbers
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		// Input and output locations
		String inputFilePath = "C:\\multchoice\\questions.txt";
		String outputFilePath = "C:\\multchoice\\";
		// Initiate variables
		final int TOTALQUESTIONS = 50;
		String fname, lname, className;
		int schoolID;
		// Initiate question arrays
		String[] allQuestions = new String[TOTALQUESTIONS];
		String[] tenQuestions = new String[10];
		int[] randomQuestion = new int[10];
		
		// Create an array of 10 integers to get random questions using random object
		for (int i = 0; i < 10; i++) {
			int nextInt = rand.nextInt(TOTALQUESTIONS);
			
			for (int element : randomQuestion) {
	            if (element == nextInt) {
	            	nextInt = rand.nextInt(TOTALQUESTIONS);
	                break;
	            }
	        }
			randomQuestion[i] = nextInt;
		}
		
		// Assign each question into an array and format
		// Find the location of the file and read it
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
			
			String line = "", newQuestion = "";
			int whichQuestion = 0;
			// Read the entire file and assign to line
			while ((line = reader.readLine()) != null) {
				// Check if line is empty, if so move to next line. Otherwise concatenate to string
				if (line.isEmpty()) {
					allQuestions[whichQuestion] = newQuestion;
					newQuestion = "";
					whichQuestion++;
				} else {
					int index = line.indexOf(". ");
					if (index != -1) {
						// Extract the substring after the dot-space
				        line = line.substring(index + 2); // +2 to skip the dot and space
					}
					line = line.trim();
					newQuestion += line + " ";
					
				}

			}
			
			// Input all random questions into an array using the random array
			for (int i = 0; i < 10; i++) {
				int index = randomQuestion[i];
				tenQuestions[i] = allQuestions[index];
			}
			
		} catch (IOException e) {

			System.out.println("Oops! Not able to read your file!!!");

		}
		
		// Ask and get the users name, class, and school ID
		System.out.println("First Name?");
		fname = input.nextLine();
		System.out.println("Last Name?");
		lname = input.nextLine();
		System.out.println("Class Name?");
		className = input.nextLine();
		System.out.println("School ID?");
		schoolID = input.nextInt();
	}

}
