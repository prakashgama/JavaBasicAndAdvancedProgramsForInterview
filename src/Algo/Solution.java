package Algo;
import java.util.*;
 import java.util.stream.*;
class UniqNumberInArray {
	
	
	
	public static void main(String[] args) {
		int a[]= {-1,-3,-2};
		System.out.println(solution(a));
		
	}
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
List<Integer> x=Arrays.stream(A).boxed().collect(Collectors.toList());
for(int i=1;i<=A.length+1;i++)
{
if(!x.contains(Integer.valueOf(i)))
{
	System.out.println(x.contains(Integer.valueOf(i)));
	System.out.println("pk"+i);
return i;
}

}
return 1;
        
    }
}