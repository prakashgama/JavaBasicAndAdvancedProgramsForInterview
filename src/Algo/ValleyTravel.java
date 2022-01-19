package Algo;

public class ValleyTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	   public static int countingValleys(int steps, String path) {
		    // Write your code here
	int temp=0;
	int visit=0;
	int prevtemp=0;
for(char c:path.toCharArray())
{
	if(c=='U')
	{
		temp++;
	}else
	{
		temp--;
	}
	
	if(temp==0 && prevtemp<0)
	{
		visit++;
	}
	
	prevtemp=temp;
}
		   
		   
		   return visit;

		    }
	
}
