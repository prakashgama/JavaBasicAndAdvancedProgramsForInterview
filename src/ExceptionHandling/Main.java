package ExceptionHandling;
// A Class that uses above MyException 
public class Main 
{ 
    // Driver Program 
    public static void main(String args[]) throws Exception 
    { 
    	
    	Main n=new Main();
    	n.Excepit();
        try
        { 
            // Throw an object of user defined exception 
            throw new MyException("GeeksGeeks"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
    }
    
    public void Excepit() throws Exception
    {
    	throw new Exception();
    }
}