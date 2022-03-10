package set;

import java.util.*;

public class BasicHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s=new HashSet<Integer>();
		
		s.add(1);

		s.add(1);
		s.add(2);
		s.add(7);
		s.add(3);
		
		s.forEach(System.out::println);
		

		Set<MyClassForSet> s1=new HashSet<MyClassForSet>();
		MyClassForSet a1=new MyClassForSet(0, "prakash");
		MyClassForSet a2=new MyClassForSet(1, "prakash");
		MyClassForSet a3=new MyClassForSet(2, "prakash");
		MyClassForSet a5=new MyClassForSet(2, "prakash");
		MyClassForSet a4=new MyClassForSet(3, "prakash");
		s1.add(a1);
		s1.add(a2);
		s1.add(a3);
		s1.add(a4);
		s1.add(a5);
		s1.forEach(System.out::println);
		
	}

}
