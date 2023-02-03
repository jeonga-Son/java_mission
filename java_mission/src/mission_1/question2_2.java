package mission_1;

public class question2_2 {

	public static void main(String[] args) {
		int number = 5;
		String str = "*";
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str);
			}
			
			System.out.println();
		}
	}

}
