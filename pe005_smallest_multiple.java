import java.io.IOException;

public class pe005_smallest_multiple {

	static int find_gcd(int num1, int num2) {
		int max = num1 >= num2 ? num1 : num2;
		int min = num2 == max ? num1 : num2;

			while(min!=0 ) {
				int rem = max % min;
				max = min;
				min = rem;
			}
			return max;
		}
		
	public static void main(String[] args) throws IOException {
			int lcm = 1;
			int range = 20;
			
			for(int i = 2 ; i <= range ; i++) {
				
			
			int gcd = find_gcd(lcm,i);
			
			int temp = (lcm*i)/gcd;
			
			lcm = (lcm<temp)?temp:lcm;
			
			}
			
		
			System.out.println(lcm);
		
	}
	
}
