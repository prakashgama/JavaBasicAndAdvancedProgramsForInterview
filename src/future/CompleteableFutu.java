package future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompleteableFutu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompleteableFutu c=new CompleteableFutu();
		
		List<Integer> s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		for(int i:s)
		{
		CompletableFuture.supplyAsync(
		        () -> {
		          
		        return c.method1(i);
		        })
		    .thenAccept(
		        (h) -> {
		       
		         c.method2(h);
		        });

		}
	}
	
	public String method1(int i)
	{
		System.out.println(i);
		return "Prakash";
	}
	
	public void method2(String name)
	{
		System.out.println("method2 "+name);
	}
	

}
