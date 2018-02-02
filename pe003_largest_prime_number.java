import java.io.IOException;

public class pe003_largest_prime_number {

	
	static int[] find_factors(long num) {

		int output[] = new int[(int)Math.sqrt(num)];
		int counter = 0 ;
		while(num%2 == 0) {
			num = num / 2;
			output[counter]=2;
			counter++;
		}
		
		for(int i=3; num>2; i=i+2) {
			while(num%i == 0) {
				num=num / i;
				output[counter] = i;
				counter++;
			}
		}
		
		return output;
		
	}
	
	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		System.out.println("Enter the number : ");
		str = reader.readLine();
		long test = Long.parseLong(str);
		int prime_factors[] = find_factors(test);	
		
		
		/*
		System.out.println("\n\nPrime factors of "+test+" are : \n");
		int i = 0;
		while(prime_factors[i] >0) {
			System.out.print(prime_factors[i]+"\t");
			i++;
		}
		
		*/
		
		int i = 0,largest = 0;
		while(prime_factors[i] >0) {
			if (prime_factors[i] > largest) { largest = prime_factors[i]; }
			i++;
		}
		
		System.out.println("\n\nLargest prime factors of "+test+" is : "+largest);
		
		
		
		}
	
	
}
