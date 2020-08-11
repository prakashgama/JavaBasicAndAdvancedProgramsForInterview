package math;

import java.util.HashSet;
import java.util.Set;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Set<Long> l=new HashSet<Long>();
		while(l.size()<=100)
		{
			Long j=Math.round(Math.random()*100);
		i++;
		l.add(j);
	
		}
		System.out.println(i);
	}
	
	
	
	public void random()
	{
		for(int i=1;i<=100;i++)
		{
			
		}
	}
}
