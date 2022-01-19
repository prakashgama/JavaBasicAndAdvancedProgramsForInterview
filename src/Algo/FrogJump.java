package Algo;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(2/2);
		System.out.println(jump2(10,60,20));
		
		
	}

	
	
	public static int jump(int x,int y,int d)
	{
		if ((y - x) % d == 0) {
		    return (y - x) / d;
		}
		return (y - x) / d + 1;
	}
	
	public static int jump2(int X,int Y,int D)
	{
		int distance=Y-X;
	int jump=0;
	while(distance>0)
	{
		distance-=D;
		jump++;
	}
	return jump;	
	}
}
