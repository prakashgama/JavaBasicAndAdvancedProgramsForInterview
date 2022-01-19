package Algo;

import java.lang.System.Logger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindOddinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindOddinArray a=new FindOddinArray();
		int []c= {1,1,2,2,3,3,4,4,5};
		List.of(c);
	//System.out.println(a.solution(c));	
	System.out.println(a.findUnpaired(c));

	}

	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 
		
	        
	        List<Integer> s=new ArrayList<Integer>();
	for(int i:A)
	{
	if(s.contains(i))
	{
	   s.remove(Integer.valueOf(i));
	}
	else
	{
	   s.add(i);
	}
	}
	
	return s.get(0);
	 }
	 
	 public int findUnpaired(int[] A) {
		 int i;                  
		 int unpaired;          

		 unpaired = A[0];      
		 System.out.println("index i= "+0+" array value a["+0+"]="+A[0]+" unpaied ="+unpaired);
		    
		 for(i=1;i<A.length;i++) {   
		    unpaired ^= A[i];  
		    System.out.println("index i= "+i+" array value a["+i+"]="+A[i]+" unpaied ="+unpaired);
		    
		 }
		 return unpaired;       
		}
	 
}
	