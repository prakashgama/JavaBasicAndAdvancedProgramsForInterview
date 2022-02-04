package Algo;

import java.util.ArrayList;
import java.util.List;

public class ShiftNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num=new ArrayList<Integer>();
		num.add(0);
		num.add(-1);
		num.add(1);
		num.add(2);
		num.add(-2);
		num.add(3);
		num.add(-3);
		
		List<Integer> num2=new ArrayList<Integer>();
		for(Integer x:num)
		{
			if(x<0)
			{
				num2.add(x);
			}
			
		}
		for(Integer x:num)
		{
			if(x>=0)
			{
				num2.add(x);
			}
			
		}
		
		System.out.println(num2);
		System.out.println(num2.stream().max(Integer::compareTo).get());
	}

}
