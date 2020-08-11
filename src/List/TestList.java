package List;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> c=new ArrayList<Integer>(3);
	
		for(int i=0;i<5;i++)
		{
			c.add(i);
			System.out.println(c.size());
		}
		System.out.println(c.size());
		
	}

}
