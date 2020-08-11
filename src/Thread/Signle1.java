package Thread;

public class Signle1 implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
		
			System.out.println("Signle1 working");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		}


	public static void  red()
	{
	System.out.println("Red");	
	Signel2 s=new Signel2();
	try {
		s.wait(5000);
		s.notifyAll();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void green()
	{
		System.out.println("Green");
		Signel2 s=new Signel2();
		try {
			s.wait(5000);
			s.notifyAll();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
