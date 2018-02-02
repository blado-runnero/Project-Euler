
public class pe009_special_pythagorean_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2 ; i < 500 ; i++ ) {
			for (int j=1; j<i; j++ ) {
				int mul = i*i + j*j;
				double sqrt = Math.sqrt(mul);
				int sqrtt = (int) Math.abs(sqrt);
				if(sqrtt*sqrtt == mul && (sqrtt+i+j)==1000) {
					System.out.print(i+"\t"+j+"\t"+sqrtt+"\n");
					System.out.print("\n"+(sqrtt*i*j));
					
				}
				//System.out.println(sqrt+"");
			}
		}
	}

}
