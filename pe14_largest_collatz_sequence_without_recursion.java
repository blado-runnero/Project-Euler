
public class pe14_largest_collatz_sequence_without_recursion {


	
	static int collatz(long n) {
		int count = 1;
		while(n!=1) {
			if (n%2==0) {
				n=n/2;
			}else {
				n = 3* n;
				n++;
			}
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int max_number = 0;
		long i;
		for ( i = 2; i<=999999; i++) {
			long count = collatz(i);
			if (count>=max) {max=(int) count; max_number = (int) i;}
			count = 1;	
		}
		System.out.println(max_number+"\t"+max);
	}
	
}
