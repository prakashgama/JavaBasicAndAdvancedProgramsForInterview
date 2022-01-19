package Algo;
import java.io.*;

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

public class UnpairedCount {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
public static void main(String[] args) {
	
}
    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here


   List<Integer> d=new ArrayList<Integer>();
int count =0;
for(Integer x:ar)
{
    if(d.contains(Integer.valueOf(x)))
    {
    d.remove(Integer.valueOf(x));
    count++;
    }
    else
    {
    	d.add(x);
}



    }
return d.size();
}


}
