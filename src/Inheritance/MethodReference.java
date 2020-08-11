package Inheritance;
interface Sayable{  
    void say(String Hello);  
}  
public class MethodReference extends ExtendMethodRefrence {  
    public static void saySomething(String Hello){  
        System.out.println("Hello, this is static method." + Hello);  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = ExtendMethodRefrence::saySomething;  
        // Calling interface method  
        sayable.say("Hello");  
        
    }  
}  