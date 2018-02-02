
public class pe002_even_fibonacci_numbers {

	public static void main(String args[]) {
		int f1 = 1, f2 = 2;
		int even_fib_sum = 2;
		int range = 4000000;
		
		for(int i = 2; i<=range; ) {
			int temp = f2+f1;
			f1 = f2;
			f2 = temp;
			
			if (f2%2==0) {
				even_fib_sum += f2;
			}
				
			i=f2;
		}
		
		System.out.println(even_fib_sum);
		
	}
	
}
