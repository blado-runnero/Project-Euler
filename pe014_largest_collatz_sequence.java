	
public class pe014_largest_collatz_sequence {
	
	static int count = 1;
	
	static void collatz(long n) {
		if (n==1) {System.out.println("1");}
		else {
			if (n%2==0) {
				n=n/2;
				count++;
				System.out.println(n);
				collatz(n);
		}
		else {
				n = 3*n;
				n++;
				count++;
				System.out.println(n);
				collatz(n);
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int max_number = 0;
		long i;
		for ( i = 2; i<=999999; i++) {
			collatz(i);
			if (count>=max) {max=count; max_number = (int) i;}
			count = 1;	
		}
		System.out.println(max_number+"\t"+max);
	}
}
