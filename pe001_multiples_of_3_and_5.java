
public class pe001_multiples_of_3_and_5 {

	public static void main(String args[]) {
		int sum = 0;
		
		int sum_till = 1000;
		
		for (int i = 1; i <sum_till; i++ ) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(""+sum);
	}
	
}
