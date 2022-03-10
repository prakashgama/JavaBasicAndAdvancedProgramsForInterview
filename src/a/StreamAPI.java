package a;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= {1,2,3,4,5};
		
	Integer c=	Stream.of(a).max(Comparator.comparing(Integer::new)).get();
		System.out.println(c);
	}

}
