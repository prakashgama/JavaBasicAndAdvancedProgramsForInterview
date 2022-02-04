package String;

import java.util.HashMap;
import java.util.HashSet;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s="prakash";
		String t="rakashp";
		
		
		HashSet<Character> h1=new HashSet<Character>();

		HashSet<Character> h2=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			h1.add(s.charAt(i));
			h2.add(t.charAt(i));
			
		}

		
		System.out.println(h1.equals(h2));
		
		HashMap<Character, Integer> h3=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(h3.containsKey(s.charAt(i)))
					{
				h3.put(s.charAt(i),h3.get(s.charAt(i))+1);
					}
			else
			{
				h3.put(s.charAt(i), 1);
			}
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(h3.containsKey(t.charAt(i)))
					{
				h3.replace(t.charAt(i), h3.get(t.charAt(i))-1);
				if(h3.get(t.charAt(i))==0)
				{
					h3.remove(t.charAt(i));
				}
					}
			else
			{
				break;
			}
		}
		System.out.println(h3.size()==0?true:false);
		
	}

}
