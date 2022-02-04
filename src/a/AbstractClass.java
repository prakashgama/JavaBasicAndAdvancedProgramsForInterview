package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import basic.AbstractFinalClass;

public class AbstractClass {

	
	public static void main(String[] args) throws ArithmeticException{
		
		Throwable ts=new Throwable();
		int i=0;
		String a=new String("A");
		
		String b="A";
		
		
		LinkedList<String> aas=new LinkedList<String>();
		
		aas.add("A");

		aas.add("A");

		aas.add("A");

		aas.add("A");
		
		
		System.out.println(aas);
		
		
		
		List<String> fri=new ArrayList<String>();
		
		fri.add("Mango");
		fri.add("Orangd");
		fri.add("Apple");
		fri.add("Banana");
		
		List<Character> s=fri.stream().filter(x->x.toUpperCase().charAt(0)=='A' ||x.toUpperCase().charAt(0)=='E'||x.toUpperCase().charAt(0)=='O' ).
				map(x->x.charAt(x.length()-1)).toList();

System.out.println(fri);
System.out.println(s);
AbstractClass asd=new AbstractClass();
asd.test1s(null);
int countone=0;
int n=6;
StringBuilder sa=new StringBuilder();
while(n>=1)
{
    
  n = (n & (n << 1));
 
            countone++;
    
}
System.out.println(countone);
System.out.println(sa);
	}
	
	public void test1s(Object t)
	{
		System.out.println("Object");
	}
	public void test1s(String t)
	{
		System.out.println("String");
	}
	/*
	 * public void test1s(Long t) { System.out.println("Long"); }
	 */
	/*
	 * public void test1s(long t) { System.out.println("long"); } public void
	 * test1s(int t) { System.out.println("int"); }
	 */
	
}		
		
		
