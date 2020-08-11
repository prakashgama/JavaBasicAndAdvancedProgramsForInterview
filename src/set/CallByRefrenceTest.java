package set;

import java.util.HashSet;
import java.util.Set;

public class CallByRefrenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass a=new MyClass();
		
		a.setA(1);
		a.setName("prakash");
		
		System.out.println(a.getName());

	
		Set<MyClass> t=new HashSet<MyClass>();
		t.add(a);
		System.out.println(t);
	
		System.out.println(t);
		System.out.println(a.getName());
		t.add(myMethod(a));
		t.add(myMethod(a));
		t.add(myMethod(a));
		System.out.println(t);		
	}
	
	public static MyClass myMethod(MyClass a)
	{MyClass c=new MyClass();
		
		a.setA(a.getA()+1);
		c.setA(a.getA());
		c.setName(a.getName()+a.getA());
		return c;
	}
	

}
