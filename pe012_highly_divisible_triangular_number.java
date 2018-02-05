
public class pe012_highly_divisible_triangular_number {

	public static void main(String args[]) {
		
		int num = 1;
		long sum = 1;
		int div_check = 2;
		int divisor_number = 2; 
		while (divisor_number<500) {
			
			divisor_number = 1; 
			
			for(int i = 2; i <= Math.sqrt(sum+100) && i<sum/2; i++) {
				if (sum % i == 0) {
					divisor_number++;
					divisor_number++;
				}
			}
			if (divisor_number >= 500) {break;}
		
			num++;
			sum = sum + (num);
			
			
			//System.out.println((num-1)+"\t"+divisor_number);
		}
		
		System.out.println(sum);
				/*+"\t"+num+"\t"+divisor_number);*/
		
	}
	
}
