package Algo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url1="https:// domain.com ? param1=1234 & param2= sagar";
		String url2="https:// domain.com ? param1=12345 & param2= prakash";
		String as[] =url1.split("&");
		String t[]=as[0].split("param1=");
		
		
		System.out.println(t[1]);
		
		List<String> urls=new ArrayList<String>();
		urls.add(url1);
		urls.add(url2);
		getParams(urls);
		String date1="2022-02-01";
		SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat formatter3=new SimpleDateFormat("dd-MM-yyyy"); 
		try {
			Date sm=formatter2.parse(date1);
			System.out.println(formatter3.format(sm));
			Date tsf=formatter3.parse(formatter3.format(sm));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

public static	Map<String, String> getParams(List<String> urls)
{
	Map<String, String> map=new HashMap<String, String>();
	
	for(String s:urls)
	{int index=0;
		String urlBreak[] =s.split("&");
		if(urlBreak!=null)
		{
			String param1[]=urlBreak[index].split("param1=");
			index++;
			map.put(param1[index], "param1");
		
		String param2[]=urlBreak[index].split("param2=");
			map.put(param2[index], "param2");
		}
		System.out.println(map);
	}
	return map;
}

public static Object getInstance(String s)
{
	s="java.lang.String";
	
	return new Object();
}


public interface test2{
	
	public class tet34{
		
	}
	
}
public class tet3 implements test2{
	
}
}
