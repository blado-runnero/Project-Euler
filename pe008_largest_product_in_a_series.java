import java.io.IOException;

public class pe008_largest_product_in_a_series {

	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		System.out.println("Enter the number : ");
		str = reader.readLine();
		
		int range = 1000;
		long mul=1;
		long max = 0;
		for(int i = 0; i < str.length()-12 ; i++) {
			String strr = str.substring(i,i+13);
			
			for(int j = 0 ; j<13; j++ ) {
				char c = strr.charAt(j);
				String s = ""+c;
				//System.out.println(s);
				mul *= Integer.parseInt(s); 
			}
			if (max < mul) {max = mul;}
			System.out.println(i+"\t"+strr+"\t"+mul);
			mul = 1;
		}
		
		System.out.println(max);
		
	}
	
}
