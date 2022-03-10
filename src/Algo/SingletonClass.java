package Algo;

public class SingletonClass {

	private volatile SingletonClass s;
	
	private SingletonClass(){
		
	}
	
	public  SingletonClass getSingletonInstance()
	{
		if(s==null)
		{synchronized(this) {
			s=new SingletonClass();
			return s;
		}
		}
		return s;
	}
	
}
