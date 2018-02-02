
public class pe010_summation_of_primes {

	public static void main(String args[]) {
		//int range = 2000000;
		
		int range = 2000000;
		long sum = 2;
		
		for(int i = 3; i<=range; i=i+2 ) {
			int status = 0;
			for(int j = 2; j<Math.sqrt(i+100) && j<i/2;j++) {
				if (i%j == 0) {status++; break;}
			}
			if (status == 0) {sum = sum+i; System.out.println(i+"\t"+sum);}
		}
	
	System.out.println(sum);
	}
	
}
