package Algo;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Interview {

	int a = 10; 
	static int b = 20;
	
	static int num; 
	static String mystr;
	
	private Interview() {
		// TODO Auto-generated constructor stub
		System.out.println("Interview cons");
	}
	
	static {
		num=100;
		System.out.println("first");
	}
static {
		num=200;
		System.out.println("second");
	}
	
	
	public static void main(String[] args) {
	
		String s2="Prakash soni";
	
		
		/*
		 * Interview t=new Interview(); t.a=20; t.b=200; Interview t1=new Interview();
		 * System.out.println("a "+t.a+" b "+t.b);
		 * System.out.println("a "+t1.a+" b "+t1.b);
		 * 
		 * System.out.println(num);
		 * 
		 * final int a = 1, b = 5; for (int i = 0; a < b; i++) {
		 * System.out.println("Hello"); } //System.out.println("Hi"); ERROR
		 * 
		 * 
		 */
		String s = "foo"; 
		 Object o = (Object)s; 
		 if (s.equals(o)) 
		 { 
		 System.out.print("AAA"); 
		 } 
		 else 
		 {
		 System.out.print("BBB"); 
		 } 
		 if (o.equals(s)) 
		 {
		 System.out.print("CCC"); 
		 } 
		 else 
		 {
		 System.out.print("DDD"); 
		 }
	}
}

