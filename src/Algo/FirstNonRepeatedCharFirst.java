package Algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedCharFirst {
    public static void main(String args[]) {
     
        String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
        
        
        String tes="Hello World ";
        StringBuilder s=new StringBuilder();
      //  System.out.println(tes.chars().;
        System.out.println(Arrays.toString(tes.trim().split(" ")));
    }
    
    public static Character findFirstNonRepeatableChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
       // Arrays.
    //    str.chars().boxed().map(x->Character.valueOf((char)x)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
} 
}
