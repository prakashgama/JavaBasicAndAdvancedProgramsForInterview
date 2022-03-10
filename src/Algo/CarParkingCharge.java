package Algo;

public class CarParkingCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="17:00";
		String s2="18:00";
		System.out.println(solution(s1, s2));
	}
	   public static int solution(String E, String L) {
	        // write your code in Java SE 8

	int entryHour=Integer.valueOf(E.substring(0,2));
	int exitHour=Integer.valueOf(L.substring(0,2));
	int entryMin=Integer.valueOf(E.substring(3,5));
	int exitMin=Integer.valueOf(L.substring(3,5));
	
	int totalMin=(exitHour*60)+exitMin-((entryHour*60)+entryMin);
int	totalhour=totalMin/60;
System.out.println(totalMin);
System.out.println(totalhour);
	if(totalhour>=1)
	{
		if(totalMin%60==0)
		{
			totalhour--;
		}
		
		return 5+totalhour*4;
	}
	else
	{
		return 5;
	}
	
	   }
}
