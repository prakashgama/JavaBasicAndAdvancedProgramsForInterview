package sorting;

import java.util.HashMap;
import java.util.Map;

public class SortingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		map.put(1,7);

		map.put(2,0);
		map.put(3,1);
		map.put(5,2);
		map.put(4,3);
		
		System.out.println(map.keySet().stream().findAny());
		System.out.println(map.keySet().stream().findFirst());
		
		
		String t1=new String("abc");

		String t=new String("abc");
		
		System.out.println(t1==t);
	}

}
