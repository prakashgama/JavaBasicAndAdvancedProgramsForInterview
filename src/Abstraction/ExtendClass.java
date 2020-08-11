package Abstraction;

public class ExtendClass extends AbsrtactClass {

public	String a="ex";
	@Override
	public void akash() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ExtendClass a=new ExtendClass();//Print abstract class constructor value
		a.akash(); //Not define any print statment
		a.prakash(); //print heelo prakash
		System.out.println(a.a); // print extend class value
		System.out.println(a.b); // print abstract class value
		System.out.println(AbsrtactClass.a); // print abstract class value
		AbsrtactClass d=new Text1();
		d.akash();

		AbsrtactClass e=new Test2();
		e.akash();
	}
}
