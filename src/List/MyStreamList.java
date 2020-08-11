package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyStreamList {

	public static void main(String[] args) {

		List<String> l=new ArrayList<String>();
	    l.add("prakash");
	    l.add("akash");
	    l.add("robin");

	    Iterator<String> s=l.iterator();
	    int i=0;
	    while(s.hasNext())
	    {
	    l.add(l.get(i).toUpperCase());
	 i++;
	    }
	    System.out.println(l);
	    System.out.println("Normal Method "+normalMethod(l));

	    System.out.println("Stream Method "+streamMethod(l));

	}
	
	
public static List<String> normalMethod(List<String> l)
{System.out.println(l);

	List<String> l2=new ArrayList<String>();
    for(String s:l)
    {
    	l2.add(s.toUpperCase());
    
    }
    return l2;
}

public static List<String> streamMethod(List<String> l) {
	
	
return	l.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
}

}
