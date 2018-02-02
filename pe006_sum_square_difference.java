
public class pe006_sum_square_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 100;
		int square_sum = 0;  
		int sum = range*(range+1)/2;
		int sum_square = sum*sum;
		for (int i = 1; i <= range; i++) {
			square_sum += i*i;
		}
		int difference = sum_square - square_sum;
		System.out.println(difference);
		
	}

}
