package countByFives;

public class CountByFives {
	public static void main(String[]args) {
		int START=5;
		int STOP=500;
		int count=5;
		int iteration=0;
		while (START<=STOP) {
			System.out.print(START + ", ");
			START += count;
			iteration++;
			if (iteration%10==0) {
				System.out.println();
			}
			}
}
}
