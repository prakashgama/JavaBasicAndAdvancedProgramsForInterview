package a;
import java.util.*;
import java.util.stream.Collectors;
public class MyClass {
    public static void main(String args[]) {
      List<String> str = new ArrayList<>();

      str.add("priyal");
      str.add("ashu");
      str.add("prakash");
      str.add("akanksha");
      str.add("hussain");
      str.add("pratap");

    str=  str.stream().sorted().collect(Collectors.toList());

      System.out.println(str.toString());

  Map<Character,String> s= str.stream().collect(Collectors.toMap(p->p.toLowerCase().charAt(0),
		  p->p.toString(),(oldValue, newValue) -> oldValue+","+newValue));
  
  List<List<String>> str2 = new ArrayList<>();

  str2.add(Arrays.asList("prakash","soni"));
  str2.add(Arrays.asList("robin","singh"));
  str2.add(Arrays.asList("heena","verma"));
 
  
  str2.stream().flatMap(list -> list.stream()).forEach(System.out::println);
  
  System.out.println(s);
    }
}