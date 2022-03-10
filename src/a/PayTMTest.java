package a;
import java.math.*;

import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'palindromeChecker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndex
     *  3. INTEGER_ARRAY endIndex
     *  4. INTEGER_ARRAY subs
     */

    public static String palindromeChecker(String s, List<Integer> startIndex, List<Integer> endIndex, List<Integer> subs) {
    // Write your code here
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<startIndex.size();i++)
    {
     String sub=s.substring(startIndex.get(i),endIndex.get(i)); 
       sb.append(isPalinDrom(sub,subs.get(i)));
    }
    
return "101";
    }
    
    public static int isPalinDrom(String s,int subtitutioAllowed)
     {
        int correct=0;
        int incorrect=0;
        for(int i=0;i<s.length();i++)
     {
         if(s.indexOf(s.charAt(i))+s.lastIndexOf(s.charAt(i))==s.length())
         {
             if(s.length()!=1 && s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
             correct++;
             else
             if(s.length()==1)
             {
                  correct++;
             }
         }
         else
         {
             incorrect++;
         }
     } 
     if(correct==s.length()-1)
     {
         return 1;
     }
     else
     {
         
         
         if(s.length()<subtitutioAllowed)
         {
             return 1;
         }
     }
     return 0;
        
    }

}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int startIndexCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> startIndex = IntStream.range(0, startIndexCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int endIndexCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> endIndex = IntStream.range(0, endIndexCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int subsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> subs = IntStream.range(0, subsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        String result = Result.palindromeChecker(s, startIndex, endIndex, subs);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
*/
