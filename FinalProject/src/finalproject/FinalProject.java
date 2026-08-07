package finalproject;
import java.util.*;
import java.io.*;

public class FinalProject {

	public static void main(String[] args) {
		try (// Setup scanner for user input and random for random numbers
		Scanner input = new Scanner(System.in)) {
			Random rand = new Random();
			// Input and output locations
			String inputFilePath = "C:\\multchoice\\questions.txt";
			String outputFilePath = "C:\\multchoice\\results.txt";
			// Initiate variables
			final int TOTALQUESTIONS = 50;
			String fname, lname, className;
			int schoolID;
			int score = 0;
			// Initiate question arrays
			String[] allQuestions = new String[TOTALQUESTIONS];
			String[] tenQuestions = new String[10];
			int[] randomQuestion = new int[10];
			char[] studentAnswers = new char[10];
			char[] correctAnswers= new char[10];
			
			
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
				 Set<Integer> questionIndices = new HashSet<>();
				    while (questionIndices.size() < 10) {
				        questionIndices.add(rand.nextInt(TOTALQUESTIONS));
				    }

				    // Select random questions and parse correct answers
				    int questionIndex = 0;
				    for (int i : questionIndices) {
				        String[] parts = allQuestions[i].split("\\|"); // Format: Question|Option A|Option B|Option C|Option D|CorrectAnswer
				        if (parts.length == 6) {
				            tenQuestions[questionIndex] = String.join("\n", Arrays.copyOfRange(parts, 0, 5));
				            correctAnswers[questionIndex] = parts[5].trim().charAt(0);
				            questionIndex++;
				        }
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
			
			// Ask questions and get answers
			for (int i=0;i<10;i++) {
				System.out.println(tenQuestions[i]);
				studentAnswers[i]=input.nextLine().toUpperCase().charAt(0);
			}
			// calculate score
			for (int i=0;i<10;i++) {
				if(studentAnswers[i]==correctAnswers[i])
					score++;
			}
			
			// write results to file
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) {
			    writer.write("Student: " + fname + " " + lname + "\n");
			    writer.write("Class: " + className + "\n");
			    writer.write("School ID: " + schoolID + "\n");
			    writer.write("Score: " + score + "/10" + "\n");
			    writer.write("Answers:\n");
			    for (int i = 0; i < 10; i++) {
			        writer.write("Question " + (i + 1) + ": " + studentAnswers[i] + " (Correct: " + correctAnswers[i] + ")\n");
			    }
			    writer.write("\n");
			} catch (IOException e) {
			    System.out.println("Error writing results file: " + e.getMessage());
			}
		}
	}

}