package Algo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="adasdasdasdasdasfdfgrgerhrasfasfasfasfasfasfasfasfascvdfbfddffafas"
				+ "tdxvdzvdzfretgsrgsgsdgdgdsbababdasdasdasdasdasdasdasdasdcdscsdcsdc"
				+ "asdasdasdasdasdasdasdasdasdasdasddasdasfdsgfsdgdgseraaaafsfasfasf";
		int min=2;
		int max=4;
int uniq=26;
new Stringtest().test(a,min,max,uniq);
	}

	
	public void test(String a,int min,int max,int uniq)
	{
		

		Map<String, Integer> d=new HashMap<String, Integer>();
		
		for(int i=0;i+min<=a.length();i++)
		{
			int temp=min+i;
			while(temp<=a.length())
			{String s=a.substring(i, temp);
			if(s.length()<=max)
			{
				if(d.get(a.substring(i, temp))!=null && d.get(a.substring(i, temp))<uniq)
		d.put(a.substring(i, temp), d.get(a.substring(i, temp))+1);	
			else
			{
				d.put(a.substring(i, temp), 1);
			}
			}
				temp++;
			}
		}
		System.out.println(d.values().stream().max(Comparator.comparing(Integer::new)).get());
		
	}
}
