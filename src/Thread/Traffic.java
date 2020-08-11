package Thread;

public class Traffic  {

	public static void main(String[] args) {

		
		Signle1 s1=new Signle1();
		
		Signel2 s2=new Signel2();
		
		Thread t1=new Thread(s1);
		
		Thread t2=new Thread(s2);
		
		t1.start();
		t2.start();
		
	}

	
	
	
}
