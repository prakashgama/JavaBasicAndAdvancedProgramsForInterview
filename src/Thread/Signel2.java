package Thread;

public class Signel2 implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			
			System.out.println("Signle2 working");	
		try {
			Thread.sleep(5000);
			Signel2.red();
			
			
			
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
