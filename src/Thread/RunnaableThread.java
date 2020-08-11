package Thread;

public class RunnaableThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnaableThread r=new RunnaableThread();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread running this"+i);
		}
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread running this"+i);
		}
		
	}

}
