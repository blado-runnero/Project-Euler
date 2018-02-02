
public class pe007_10001st_prime {

	public static void main(String args[]) {
		int range = 10001;
		int counter= 0;
		int check_prime = 2;
		while(counter < range) {
			int status = 0;
			for(int i = 2; i<(check_prime+3)/2;i++ ) {
				if (check_prime % i ==0) {
					status++;
					
					break;
				}
			}
			if (status == 0) {
				System.out.println(counter+"\t"+check_prime);
				counter++;
			}
			check_prime++;
			
		}
		System.out.println(check_prime-1);
	}
	
}
