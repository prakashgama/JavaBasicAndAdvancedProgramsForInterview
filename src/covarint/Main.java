package covarint;
class A {} 
class B extends A {} 
  
class Base 
{ 
    A fun() 
    { 
        System.out.println("Base fun()"); 
        return new A(); 
    } 
} 
  
class Derived extends Base 
{ 
    A fun() 
    { 
        System.out.println("Derived fun()"); 
        return new B(); 
    } 
} 
  
public class Main 
{ 
    public static void main(String args[]) 
    { 
       Base base = new Base(); 
    A a=   base.fun(); 
  
       Base d=new Derived();
      B c= (B) d.fun();
       
       Derived derived = new Derived(); 
       derived.fun(); 
      
    } 
} 