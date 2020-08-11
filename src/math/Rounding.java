package math;

import java.text.DecimalFormat;

public class Rounding {

	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float a=(float) 0;
		
		if(a==0)
		{
			System.out.println(true);
		}
	
		float b=(float) 1.235;
		
		System.out.println(df.format(a));

		System.out.println(df.format(b));
		
	}

}
