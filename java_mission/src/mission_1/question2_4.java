package mission_1;

public class question2_4 {

	public static void main(String[] args) {
		int number = 5;
		int idx = 0;
		String str1 = " ";
		String str2 = "*";
		
		for (int i = 0; i < number; i++) {
			idx = 0;
			
			for (int j = number; j > i; j--) {
				System.out.print(str1);
				idx++;
			}
			
			for (int j = 0; j <= number - idx; j++) {
				System.out.print(str2);
			}
			
			for (int j = 0; j <= number - idx - 1; j++) {
				System.out.print(str2);
			}
			
			System.out.println();
		}
	}
}
