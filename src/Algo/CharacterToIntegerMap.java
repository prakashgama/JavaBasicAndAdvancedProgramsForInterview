package Algo;

import java.util.HashMap;
import java.util.Map;

public class CharacterToIntegerMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Character> s=new HashMap<Integer, Character>();
		int j=1;
		for(int i =65;i<='Z';i++)
		{
			s.put(j, (char) i);
			j++;
		}
		
		System.out.println(s);

	}

}
