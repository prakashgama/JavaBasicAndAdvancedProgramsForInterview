package Algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> c=Arrays.asList(0,1,0,1,0,0,0);
System.out.println(cloud(c));
	}
	
	 public static int cloud(List<Integer> c) {
		    // Write your code here

		 System.out.println(c.size());
		 
		 return (int) (c.size()-(c.stream().filter(x->x==1).count())-1);

		    }


}
