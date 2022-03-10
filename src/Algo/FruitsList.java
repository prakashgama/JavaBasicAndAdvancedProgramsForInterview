package Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitsList {

	public final static void main(String[] args) {
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
		
		
		String str="Prakash";
		
		
		Map<Character, Long> frequency =
	            str.chars()
	               .mapToObj(c -> (char)c)
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		System.out.println(map);
		System.out.println(frequency);
		
		List<String> name = new ArrayList<>();
		name.add("heena");
		name.add("heena");
		name.add("yatendra");
		name.add("xyz");
		name.add("yatendra");
		
		
		List<Integer> l;
		
		
		
	Map<Long, String>	t=name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
			entrySet().stream().collect(Collectors.toMap(Entry::getValue, Entry::getKey,(x,y)->x,HashMap::new));
		
		System.out.println(t);
		
		/*
		 * System.out.println(test.stream().collect(Collectors.toMap(t->t.charAt(0),
		 * t->t, (x1, x2) -> fruits.addAll(Arrays.asList([x1,x2]))));
		 */

	}

}
