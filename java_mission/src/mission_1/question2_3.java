package mission_1;

public class question2_3 {

	public static void main(String[] args) {
		int number = 5;
		String str = "*";
		int idx = 0;
		
		for (int i = 0; i < number; i++) {
			idx = 0;
			
			for (int j = number; j > i; j--) {
				System.out.print(" ");
				idx++;
			}
			
			for (int j = 0; j <= number - idx; j++) {
				System.out.print(str);
			}
			
			System.out.println();
		}
	}
}
