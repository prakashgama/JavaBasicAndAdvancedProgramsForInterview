package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> c=new ArrayList<Integer>(3);
	
		for(int i=0;i<5;i++)
		{
			c.add(i);
	
		}
		Arrays.deepHashCode(new Integer [5]);
		c.stream()
	    .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
	    .forEach(System.out::println);
		
		
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		List<Integer> x=Arrays.stream(a).boxed().collect(Collectors.toList());
	final	Integer g=1;
	
		reverse(Stream.of(a)).collect(Collectors.toList()).forEach(System.out::println);;
	}
	
	@SuppressWarnings("unchecked")
	static <T> Stream<T> reverse(Stream<T> input) {
	    Object[] temp = input.toArray();
	    return (Stream<T>) IntStream.range(0, temp.length)
	                                .mapToObj(i -> temp[temp.length - i - 1]);
	}

}
