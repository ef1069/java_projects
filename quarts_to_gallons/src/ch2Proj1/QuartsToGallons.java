package ch2Proj1;

public class QuartsToGallons {
	public static void main(String[] args)
	{final int quarts_to_gallons=4;
	int quarts_needed=18;
	int gallons_needed=quarts_needed/quarts_to_gallons;
	int remainder=quarts_needed%quarts_to_gallons;
	System.out.print("A job that needs 18 quarts requires ");
	System.out.print(gallons_needed);
	System.out.print(" gallons");
	System.out.print(" and ");
	System.out.print(remainder);
	System.out.print(" quarts.");
	}

}
