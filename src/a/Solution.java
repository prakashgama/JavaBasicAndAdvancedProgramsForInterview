package a;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s=new Scanner(System.in);
        
        int input=s.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=0;i<input;i++)
        {
            String f=s.nextLine();
            StringBuilder even=new StringBuilder();
             StringBuilder odd=new StringBuilder();
            for(int j=0;j<f.length();j++)
            {
                if(j==0 || j%2==0)
                {
                    even.append(f.substring(j,j+1));
                }
                else
                {
                    odd.append(f.substring(j,j+1));
                }
            }
            String arr=even.toString()+"  "+odd.toString();
            list.add(arr);
            
        }
        
        for(String l:list)
        {
            System.out.println(l);
        }
    }
}