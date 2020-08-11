package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClassList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassA a=new ClassA();
		a.setTest("a");
		a.setA(12l);
		ClassA b=new ClassA();
		b.setTest("b");
		b.setA(12l);
		ClassA c=new ClassA();
		c.setTest("c");
		c.setA(12l);
		ClassA d=new ClassA();
		d.setTest("d");
		d.setA(12l);
		ClassA e=new ClassA();
		e.setTest("e");
		e.setA(12l);
		
		List<ClassA> f=new ArrayList();
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(d);
		f.add(e);

		
		List<String> concat =f.stream().map(x->x.getTest()).collect(Collectors.toList());
		
		List<String> next=Arrays.asList("a","b");

		List<Long> lon =f.stream().map(h->h.getA()).collect(Collectors.toList());
	//	List<String> concat = f.stream().flatMap(x -> x.getTest().stream()).collect(Collectors.toList());
	
	f=	f.stream().filter(y->!next.contains(y.getTest())).collect(Collectors.toList());
	System.out.println(f);
		
		System.out.println(concat);
		
		System.out.println(lon);
		
		System.out.println(lon.contains(12l));
		
		
		
		
		
	}

}
