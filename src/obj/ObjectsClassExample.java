package obj;
import java.util.Objects;
public class ObjectsClassExample { 
 public static void main(String[] args) { 
	 
	 
  String value= null;
  String value1 = "abhishek";
  String value2 = "kumar";
  //To check if objects are equal
  System.out.println(Objects.equals(value1, value));  
  //To calculate hashcode for multiple values
  System.out.println(Objects.hash(value,value1,value2));
  System.out.println(Objects.hash(value1));
  //To calculate hashcode
  System.out.println(Objects.hashCode(value));
  System.out.println(Objects.hashCode(value1));
  //To check object is null 
  System.out.println(Objects.isNull(value));
  System.out.println(Objects.isNull(value1));  
  //To check object is non null  
  System.out.println(Objects.nonNull(value));
  System.out.println(Objects.nonNull(value1));  
  // To check object is not null and throw null pointer exception if its null
  //System.out.println(Objects.requireNonNull(value));
  // To check object is not null and throw null pointer exception if its null with msg
  //System.out.println(Objects.requireNonNull(value, "Value object has null value"));
  
  // To check object is not null and throw null pointer exception if its null with supplier object
  System.out.println(Objects.requireNonNull(value, ()-> "value is null"));  
 }
}