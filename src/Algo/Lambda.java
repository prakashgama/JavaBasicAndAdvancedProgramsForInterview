package Algo;

public class Lambda {
	/*
	 * Write a lambda exp. & execute it to multiply 2 numbers and print the result
	 * i/p: 10,20 o/p: 10*20=200
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My t=(x,y)->{
			return x*y;
		};
		
		System.out.println(t.calculate(4, 5));
		
		
	}

}


interface My{
	
	public int calculate(int a,int b);
}