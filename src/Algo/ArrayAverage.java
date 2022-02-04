package Algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[]= {4, 2, 2, 5, 1, 5, 8};


System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		Map<Integer,Float> map=new HashMap<Integer, Float>();

		for(int i=0;i<A.length;i++)
		{
		Float average=Float.valueOf(A[i]);
		Float divideby=Float.valueOf(2);
		Float sum=Float.valueOf(A[i]);
			for(int j=i+1;j<A.length;j++)
			{
				
				sum=sum+A[j];
				average= (sum/divideby);
				
				if(map.get(i)==null)
				{
				map.put(i, average);
				}
				else {
					map.put(i, map.get(i)>average?average:map.get(i));
					}
				divideby++;
			}
			
		}
		
	Float x=	map.values().stream().min(Float::compareTo).get();
	for(Entry<Integer, Float> en:map.entrySet())
	{
		if(en.getValue().equals(x))
		{
			return en.getKey();
		}
	}
 return 1;
    }

}
