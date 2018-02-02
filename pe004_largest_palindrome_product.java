
public class pe004_largest_palindrome_product {

	static int ispali(int num) {
		String str = Integer.toString(num);
		StringBuilder str_rev =new StringBuilder(str); 
		str_rev.reverse();
		
		String s3=new String(str_rev);  
		
		if (str.equals(s3)) {return 1;}
		else {return 0;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 999;
		int largest = 0;
		
		for(int i = n; i>0; i--){
			for (int j = n; j>0; j--){
				int mul = i*j;
				
				if(ispali(mul) == 1 && largest<mul){
					largest = mul;
				}
			
			}
		}
		
		
		System.out.println(largest);
		
		
	}

}




