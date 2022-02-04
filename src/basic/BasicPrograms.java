package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import basic.TestA.ClassA;

public  class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		
		h.put("A", 1);

		h.put(new String("A"), 1);
		
		h.put(new String("B"), 2);
		
		
		System.out.println(h);
		
		List<String> list1=new ArrayList<String>();
	list1.add("A");
	
	
	
	List<String> list2=list1;
	List<String> list3=new ArrayList<String>(list2);
	list1.clear();
	list2.add("B");
	
	list3.add("C");
	System.out.println(list1);
	System.out.println(list2);
	System.out.println(list3);
		
	
   TestA a=new TestA();
	TestA b=new TestB();
	//TestB c=(TestB) new TestA();
	
	TestA.ClassB fg= new TestA.ClassB();
	
	fg.print();
	System.out.println();
	
	InterfacA c=new  TestA.ClassA();
	c.print();
	
	
	}

}
