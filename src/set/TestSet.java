package set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> a=new HashSet<String>();
		
		String s=new String();
		String s1=new String("pRakash");
		s="PRakash";
		a.add(s);
		s="1";
		a.add(s);
		s="pRakash";
		a.add(s);
		a.add(s1);
		System.out.println(a);
		
		for(String s2: a)
		{
			if(s2=="pRakash")
			{
				a.remove(s2);
			
			}
		}
		System.out.println(a);
		a.add(s1);
		System.out.println(a);
		
		String p[]=new String[a.size()];

		a.toArray(p);
		System.out.println(p);
		
	}

}
