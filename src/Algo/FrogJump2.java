package Algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class FrogJump2 {
	
	public static void main(String[] args) {
		
		int a[]= {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(solution(5, a));
		System.out.println(codility(5, a));
		System.out.println(frog(5, a));
	}
	
    public static int solution(int X, int[] A) {
        // write your code in Java SE 8

List<Integer> all=new ArrayList<Integer>();

for(int i=1;i<=X;i++)
{
all.add(i);
}        
for(int k=0;k<A.length;k++)
{
    if(all.contains(A[k]))
    {
    	
        all.remove(Integer.valueOf(A[k]));
    }
    if(all.size()==0)
    {
        return k;
    }
}
        return -1;
    }
    
    public static int codility(int X, int[] A) {
        int list[] = A;
        int sum = 0;
        int searchedValue = X;

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int iii = 0; iii < list.length; iii++) {

            if (list[iii] <= searchedValue && !arrayList.contains(list[iii])) {
            	System.out.println("searched value "+searchedValue+" list[iii] "+list[iii]);
                sum += list[iii];
                arrayList.add(list[iii]);
            }
            if (list[iii] == searchedValue) {
                if (sum == searchedValue * (searchedValue + 1) / 2) {
                	System.out.println(searchedValue * (searchedValue + 1) / 2);
                    return iii;
                }
            }
        }
        return -1;
    }
    
    public static int frog(int X, int[] A) {
        int steps = X;
        boolean[] bitmap = new boolean[steps+1];
        
        for(int i = 0; i < A.length; i++){
        	System.out.println(!bitmap[A[i]]);
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                steps--;
                if(steps == 0) return i;
            }

        }
        return -1;
    }
    
    public static int treeSetSoloution(int X, int[] A){
        int steps=-1;
        Set<Integer> values = new TreeSet<Integer>();
        for(int i=0; i<A.length;i++){
            if(A[i]<=X){
                values.add(A[i]);
            }
            if(values.size()==X){
                steps=i;
                break;
            }
        }
            return steps;
        }
}