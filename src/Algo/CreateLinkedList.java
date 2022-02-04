package Algo;

import java.util.LinkedList;
import java.util.Scanner;

public class CreateLinkedList {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		String s="4 5 6 - 7 +";
	String a[]=	s.split(" ");
		System.out.println(solution(s));

	}
	
	public static int solution(String s)
	{
		String a[]=s.split(" ");
		try {
		for(String value:a)
		{
			switch(value)
			{
			case "DUP":
				callDup();
				break;
			case "POP":
				callPOP();
				break;
			case "+":
				callPlus();
				break;
			case "-":
				callMinus();
				break;
			default:
				if(Integer.valueOf(value)<=2000)
				callPush(Integer.valueOf(value));
				break;
				
				
			}
		}
		return t.pop();
		}
		
		catch (Exception e) {
			return -1;
		}
		
	}

	public static LinkedList<Integer> t=new LinkedList();
	
	public static void callDup()
	{
		int x=t.pop();
		t.push(x);
		t.push(x);
		
	}
	public static void callPlus()
	{
		int a=t.pop();
		int b=t.pop();
		t.push(a+b);
	}
	public static void callMinus()
	{
		int a=t.pop();
		int b=t.pop();
		t.push(a-b);
	}
	public static void callPush(Integer x)
	{
		t.push(x);
	}
	public static void callPOP()
	{
		t.pop();
	}
	
	
}
