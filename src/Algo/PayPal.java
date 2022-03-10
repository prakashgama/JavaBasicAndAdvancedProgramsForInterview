package Algo;

import java.util.Arrays;

public class PayPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test="ABCDEFGH";
		int split=2;
		char []s=new char[test.length()];
		
		//soloution(test, split);
		
		System.out.println(convert(test, split));
	}

	
	
	
	public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int r = 0 ; r < numRows; r++) {
            if(r >= s.length()) {
                break;
            }
            int idx = r;
            int[] steps = {2*(numRows-r-1), 2 * r};
            int j = 0;
            while (idx < s.length()) {
                sb.append(s.charAt(idx));
                if (steps[0] == 0 && steps[1] == 0) {
                    idx ++;
                } else if (steps[0] == 0) {
                    idx += steps[1];
                } else if (steps[1] == 0) {
                    idx += steps[0];
                } else {
                    idx += steps[(j++) % 2];
                }
            }
        }
        return sb.toString();
    }
	
}
