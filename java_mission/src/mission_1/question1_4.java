package mission_1;

public class question1_4 {

	public static void main(String[] args) {
		int number = 5;
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", j);
			}
			
			System.out.println();
		}
	}
}
