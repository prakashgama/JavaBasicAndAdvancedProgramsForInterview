package a;


//https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
public class PassByValue {
	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;
	
	    // we pass the object to foo
	      foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	System.out.println(aDog.getName());
	    
	    System.out.println("aDog.getName().equals(\"Max\")"+ aDog.getName().equals("Max"));
	    System.out.println("aDog.getName().equals(\"Fifi\")"+ aDog.getName().equals("Fifi"));
	    System.out.println("aDog == oldDog"+(aDog == oldDog));
	}
	
	public static void foo(Dog d) {
		System.out.println(d.getName().equals("Max"));
		d.getName().equals("Max"); // true
		
		d.setName("t");
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	    System.out.println(d.getName().equals("Fifi"));
	    d.setName("g");
	 
	}
}

