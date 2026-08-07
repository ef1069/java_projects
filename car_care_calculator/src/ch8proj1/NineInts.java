package ch8proj1;
import java.util.Scanner;

public class NineInts {
	public static void main(String[]args) {
		try(Scanner inputDevice=new Scanner (System.in)){
			int [] numbers= new int [9];
			
			for (int i=0; i<9; i++) {
				System.out.print("Enter an integer:");
				numbers[i]=inputDevice.nextInt();
			}
			System.out.print("Numbers in the array from first to last:");
			for (int j=0; j<numbers.length; j++) {
				System.out.print(numbers[j]+", ");
			}
			System.out.println();
			System.out.print("Numbers in the array from last to first:");
			for (int k=8; k>=0; k--) {
				System.out.print(numbers[k]+", ");
			}
			}
				
			
		}
	}