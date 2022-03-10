package vector;

import java.util.Vector;

public class MyVecotrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> t=new Vector<Integer>();
		
		t.add(1);

		t.add(4);

		t.add(2);

		t.add(3);

		t.add(5);
		
		t.stream().forEach(System.out::println);
		
		
		System.out.println(t.get(1));

	}

}
