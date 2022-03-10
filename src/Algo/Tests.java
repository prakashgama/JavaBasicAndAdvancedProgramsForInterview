package Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tests {
	/*
	 * Input: strList = ["eat","tea","tan","ate","nat","bat"] Output:
	 * [["nat","tan"],["ate","eat","tea"]] Pair Anagram and remove which is not
	 * anagram
	 * 
	 * arr{{prakash,40},{akash,30},{heena,80},{robin,90},{heena,10}}
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "This is a java quest is a this";
		Set<String> t=new HashSet<String>();
	System.out.println(Arrays.stream(str.split(" ")).distinct().collect(Collectors.toList()).toString().replace(",","" ));
		
		/*
		 * List<String> list=new ArrayList<String>();
		 * 
		 * list.add("eat"); list.add("tea"); list.add("tan"); list.add("ate");
		 * list.add("bat"); list.add("nat");
		 * 
		 * System.out.println(anagramList(list));
		 */
	
	String te="AbsbcgdgaAchdhslslc sfsf23##$%#^3534534DFGDSDFSeqeqweq23423$234242";
	
	te.chars().distinct().forEach(x->System.out.println((char)x));
		
	}
	
	public static List<List<String>> anagramList(List<String> strList )
	{
	
		List<List<String>> anagram=new ArrayList<List<String>>();
		
		for(int i=0;i<strList.size();i++)
		{
		char[] s=strList.get(i).toCharArray();	
		Arrays.sort(s);
		List<String> list=new ArrayList<String>();
		for(int j=i+1;j<strList.size();j++)
		{
			char[] st=strList.get(j).toCharArray();
			Arrays.sort(st);
			
			if(Arrays.compare(st, s)==0)
			{
				if(!list.contains(strList.get(i)))
				{
				list.add(strList.get(i));
				}
				list.add(strList.get(j));
			}
			
		}
		if(list.size()>0)
		{
		for(List<String> t:anagram)
		anagram.add(list);
		}	
		}
		
		return anagram;
		
	}
	
	
}
