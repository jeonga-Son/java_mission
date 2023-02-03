package mission_1;

public class question1_2 {

	public static void main(String[] args) {
		int number = 5;
		
		for(int i = 5; i > 0; i--) {
			for(int j = i * number - 4; j <= i * number; j++) {
				System.out.printf("%3d", j);
			}
			
			System.out.println();
		}
	}
}
