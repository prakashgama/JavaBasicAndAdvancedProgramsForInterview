package List;

import java.util.ArrayList;
import java.util.List;

public class Removelist {

	
	public static void main(String[] args) {
		
		List<String> t=new ArrayList();
		t.add("prakash");
		t.add("akash");
		t.add("ayushi");
		t.add("raj1");
		
		List<String> t1=new ArrayList();
		t1.add("heena");
		t1.add("raj");
		t1.add("ayushi");
		
		t.removeAll(t1);
		
		System.out.println(t);
		
	}
	
}
