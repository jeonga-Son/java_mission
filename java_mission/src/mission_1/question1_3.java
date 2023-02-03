package mission_1;

public class question1_3 {

	public static void main(String[] args) {
		int number = 5;
		int n = 1;
		int idx = 5;
		
		for (int i = 1; i <= number; i++) {
			for (int j = n; j <= idx * 2; j += 2) {
				System.out.printf("%3d", j);
			}
			
			n = idx * 2 + 1;
			idx += number;
			
			System.out.println();
		}
	}
}
