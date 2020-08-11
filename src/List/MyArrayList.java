package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyArrayList {
	
	public static void main(String[] args) {
	
	
		List l=new ArrayList();
	    l.add("prakash");
	    l.add("akash");
	    
	    
	    Set<Integer> a=new HashSet<Integer>();
	    
	    a.add(1);

	    a.add(2);

	    a.add(7);
	    a.add(5);
	    
	    System.out.println(l);

	    System.out.println(a);
	    
	    
	    
	    final MyFinalArrayList t=new MyFinalArrayList(a);
	    System.out.println(t);

	    t.add("prakash");
	    
	    System.out.println(t);
	    //Below code giving wrong output
	    final MyFinalList2 t2=new MyFinalList2(a);

	    System.out.println(t2);
	    t2.add("prakash");

	    System.out.println(t2);		    
	}

}
