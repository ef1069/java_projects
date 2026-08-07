package multchoicetestapplication;
import java.util.*;
import java.io.*;


public class MultChoiceTestApplication2 {public static void main(String[] args) {
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
		// Read questions from the file and process them
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
		    String line;
		    int questionIndex = 0;

		    // Read and process each line
		    while ((line = reader.readLine()) != null && questionIndex < TOTALQUESTIONS) {
		        int index = line.indexOf(". ");
		        
		        // Ensure ". " is found and process the question
		        if (index != -1) {
		            allQuestions[questionIndex] = line.substring(index + 2).trim();
		            questionIndex++;
		        } else {
		            System.out.println("Invalid question format in line: " + line);
		        }
		    }

		    // Ensure we've read enough questions
		    if (questionIndex < TOTALQUESTIONS) {
		        System.out.println("Warning: Only " + questionIndex + " questions found in the file.");
		    }
		} catch (IOException e) {
		    System.out.println("Error reading file: " + e.getMessage());
		}

		// Input all random questions into an array using the random array
		Set<Integer> questionIndices = new HashSet<>();
		while (questionIndices.size() < 10) {
		    questionIndices.add(rand.nextInt(TOTALQUESTIONS));
		}

		// Select random questions and parse correct answers
		int questionIndex = 0;
		String[] parts = new String[10];
		for (int i : questionIndices) {
		    parts = allQuestions[i].split("\\|"); // Format: Question|Option A|Option B|Option C|Option D|CorrectAnswer
		    if (parts.length == 6) {
		        tenQuestions[questionIndex] = String.join("\n", Arrays.copyOfRange(parts, 0, 5));
		        correctAnswers[questionIndex] = parts[5].trim().charAt(0);
		        questionIndex++;
		    }
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
		
		System.out.println(tenQuestions[1]);
		// Ask questions and get answers
		for (int i = 0; i < 10; i++) {
		    System.out.println("Question " + (i + 1) + ":\n" + tenQuestions[i]);
		    System.out.println("Enter your answer (A, B, C, or D):");

		    char answerChar;
		    while (true) {
		        String answer = input.nextLine().trim().toUpperCase();

		        // Check for empty input or invalid answers
		        if (answer.isEmpty()) {
		            System.out.println("Input cannot be empty. Please enter A, B, C, or D:");
		        } else if (answer.length() == 1 && "ABCD".indexOf(answer.charAt(0)) != -1) {
		            answerChar = answer.charAt(0);
		            break;
		        } else {
		            System.out.println("Invalid input. Please enter A, B, C, or D:");
		        }
		    }
		    studentAnswers[i] = answerChar;
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