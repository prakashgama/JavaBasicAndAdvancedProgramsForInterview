package ExceptionHandling;

public class MyException extends Exception{
	
	
	 public MyException(String s) 
	    {
	        // Call constructor of parent Exception 
	        super(s); 
	        
			 System.out.println("Hello");
	    }
}
