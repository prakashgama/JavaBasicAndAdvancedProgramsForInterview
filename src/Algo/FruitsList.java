package Algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<String> fruits=new ArrayList<String>();
		List<String> test=new ArrayList<String>();
		
		
		test.add("Apple");
		test.add("aAM");
		test.add("Orange");
		test.add("Mango");
		test.add("Prakash");
		test.add("Akanksha");
		Map<Character, List<String>> map = test.stream().collect(Collectors.groupingBy(d->d.toUpperCase().charAt(0),
				HashMap::new, Collectors.toList()));
		
		System.out.println(map);
		/*
		 * System.out.println(test.stream().collect(Collectors.toMap(t->t.charAt(0),
		 * t->t, (x1, x2) -> fruits.addAll(Arrays.asList([x1,x2]))));
		 */

	}

}
