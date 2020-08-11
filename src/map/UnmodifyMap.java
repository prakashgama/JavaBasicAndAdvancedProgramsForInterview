package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// Not Working
public class UnmodifyMap {

	public static void main(String[] args) {

		Map v=new HashMap<String, PK>();
		PK a=new PK();
		a.setX(3);
		
		PK b=new PK();
		b.setX(2);
		v.put("1", a);
		v.put("2", b);
		
		Map c=Collections.unmodifiableMap(v);
		
		PK d=(PK) c.get("1");
		d.setX(5);
		b.setX(4);
		System.out.println(c);
	}

}
