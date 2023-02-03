package mission_1;

public class question1_1 {

	public static void main(String[] args) {
		int number = 5;
		int idx = 1;
		
		for(int i = 1; i <= number; i++) {
			for(int j = idx; j <= i * number; j++) {
				System.out.printf("%3d", j);
			}
			
			System.out.println();
			
			idx += number;
		}
	}
}
