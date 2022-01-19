package Algo;

import java.math.BigInteger;

public class MathPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]C= {{9,9,7},{9,7,2},{6,9,5},{9,1,2}};
		StringBuilder d=new StringBuilder();
		for(int i=0; i<C.length; i++) {
	        for(int j=0; j<C[i].length; j++) {
	            System.out.print(C[i][j]);
	        }
		System.out.println();
		
	}
		solution(C);
		
		
	}
	
	public static String solution(int[][] A) {
	    // write your code in Java SE 8

	    int al = A.length;
	    int all = A[0].length;

	    BigInteger[][] res = new BigInteger[al+1][];
	    for(int i=0; i<al+1; i++){
	        res[i] = new BigInteger[all+1];
	        for(int j=0; j<all+1; j++){
	            res[i][j] = BigInteger.valueOf(0);
	        }
	    }

	    for(int i=1; i<al+1; i++){
	        for(int j=1; j<all+1; j++){
	            res[i][j] = res[i-1][j]
	                    .max(res[i][j-1])
	                    .multiply(BigInteger.valueOf(10))
	                    .add(BigInteger.valueOf(A[i-1][j-1]));
	        }
	    }

	    return res[al][all].toString();

	
}
}


