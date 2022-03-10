package Inheritance;

public class ClassMain {

	public static void main(String[] args) {
	
//Child can not get parents details
		//Child c=new Parents();
		//Parent can get child details
		Parents p=new Child();
		
		ClassA ds=new ClassA();
		
		ClassB sd=new ClassA();
		ds.akash();
		sd.akash();
		System.out.println();
		
		System.out.println(p.a);
		System.out.println(p.getA());
		p.display();
		
		//TO Access child methods.
		Child c=(Child) p;
		c.show();

	}

}
