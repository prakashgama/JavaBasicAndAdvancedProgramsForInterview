package a;
public class Base 
{ 
private int data; 
public Base() 
{ 
data = 5; 
} 
public int getData() 
{ 
return this.data; 
} 
} 
class Derived extends Base 
{ 
private int data; 
public Derived() 
{ 
data = 6; 
} 

/* compile time error
 * private int getData() { return data; }
 */ 
public static void main(String[] args) 
{ 
Derived myData = new Derived(); 
System.out.println(myData.getData()); 
} 
}