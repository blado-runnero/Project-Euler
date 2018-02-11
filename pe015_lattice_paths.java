
public class pe015_lattice_paths {

	static int count = 0,run_count=0;
	
	/*static void how_many_paths(int i, int j) {
		run_count++;
		System.out.println(run_count);
		if (i==20 && j ==20) {
			count++;
			return;
		}
		if(i<20 && j <20 ) {
			how_many_paths(i+1,j);
			how_many_paths(i,j+1);
		}
		if(i==20 && j < 20 ) {
			how_many_paths(i,j+1);
		}
		if(j==20 && i < 20 ) {
			how_many_paths(i+1,j);
		}
		
	}*/
	
	public static void main(String args[]) {
		int i = 20, j = 20;
		long num_paths = how_many_paths(i,j);
		System.out.println(num_paths);
		
		
	}
	

	private static long how_many_paths(int k, int j) {
		int sum = k+j;
		
		int n = sum;
		int r = 20;
		 
		long fact = 1;
		for (int i = 1; i<=20; i++) {
			fact = fact * (n-i+1);
			fact = fact / i;
		}
		
		
		
		
		System.out.println(fact);
		return fact;
	}
	
}
