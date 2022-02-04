package Algo;

import a.Solution;

public class GenomicRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="CAGCCTA";
		int p[]= {2,5,0};
		int q[]= {4,5,6};

		int x[]=solution(s, p, q);
		int i=0;
		
		
		int y[]= {};
		for(int j:x)
		{
			System.out.println(j);
		}
		
	}

	public static int[] solution(String S, int[] P, int[] Q)
	{
		int query[]=new int[P.length];
for(int i=0;i<P.length;i++)
{
	query[i]=returnValue(S.substring(P[i],Q[i]+1));
}
	
	
	return query;
	}
	
	public static int returnValue(String s)
	{
	if(s.contains("A"))
	{
		return 1;
	}
	else	if(s.contains("C"))
	{
		return 2;
	}
	else if(s.contains("G"))
	{
		return 3;
	}else
	{
		return 4;
	}
	}
}
