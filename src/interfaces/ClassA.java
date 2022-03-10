package interfaces;

import java.util.concurrent.ConcurrentHashMap;

public class ClassA implements FunctionalInterB,FunctionInterA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ClassA c=new ClassA();
	
		c.deafaultMethod();
		System.out.println("called Default");
	}

	
	

	public void test() {
		// TODO Auto-generated method stub
		
	}
	public void tests() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deafaultMethod() {
		// TODO Auto-generated method stub
		FunctionalInterB.super.deafaultMethod();
	}

}
