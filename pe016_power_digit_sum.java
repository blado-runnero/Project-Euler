import java.math.BigInteger;

public class pe016_power_digit_sum {
	public static void main(String args[]) {
		BigInteger i = BigInteger.valueOf(2);
		i = i.pow(1000);
		System.out.println(i);
		int sum = 0; 
		int status = 0;
		String s = ""+i;
		int len = s.length();
		len = len -1;
		
		while (len>=0) {
			char c = s.charAt(len);
			String ss= ""+c; 
			int x = Integer.parseInt(ss);
			sum = sum + x ;
			len--;
			System.out.println(sum+"\t"+x);
		}
		
		System.out.println(sum);

		
	}
}
