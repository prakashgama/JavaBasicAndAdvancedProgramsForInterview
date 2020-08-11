package List;

import java.util.HashMap;
import java.util.Map;

public class TestsImpl{

	public Node rotateList(Node head, int n) {

	    if (head == null) 
	        return head; 
	  
	    Node tmp = head; 
	    int len = 1; 
	    while (tmp.getNext() != null) 
	    { 
	        tmp = tmp.getNext(); 
	        len++; 
	    } 
	  
	    if (n> len) 
	        n = n % len; 
	  
	    n = len - n; 
	    if (n == 0 || n == len) 
	        return head; 
	  
	    Node current = head; 
	    int cnt = 1; 
	    while (cnt < n && current != null) 
	    { 
	        current = current.getNext(); 
	        cnt++; 
	    } 
	  
	    if (current == null) 
	        return head; 
	  
	    Node kthnode = current; 
	  
	    tmp.setNext(head); 
	  
	    head = kthnode.getNext(); 
	  
	    kthnode.setNext(null);
	    return head; 
	} 
	
	
	
	
	@Override
	public String toString() {
		return "TestsImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public static void main(String[] args) {
		TestsImpl t=new TestsImpl();
	 Node a=new Node();
	 Node b=new Node();
	 Node c=new Node();
	 Node d=new Node();
	 a.setName("prkash");
	 a.setNext(b);
	 b.setName("akash");
	 b.setNext(c);
	 c.setName("raj");
	 c.setNext(d);
	 d.setName("ok");
	 d.setNext(null);
	System.out.println(t.rotateList(d, 2));	
		
	}
}