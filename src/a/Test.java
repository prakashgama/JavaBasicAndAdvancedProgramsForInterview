package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=813962;
		//986321
	System.out.println(tests(n));	

	}

	
	public static int tests(int i)
	{
		
	List<Integer> a=new ArrayList<Integer>();
		while(i/10>0)
		{
			a.add(i%10);
		i=i/10;
	        	
		}
		a.add(i);
		
		Collections.sort(a);
		System.out.println(a);
		StringBuilder re=new StringBuilder();
		for(int j:a)
		{
		re=re.append(j);	
		}
	
		return Integer.valueOf(re.reverse().toString());
	}
}
