package math;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1/9;
		int y=11%10;
		
		System.out.println(x);
		System.out.println(y);
	
		MyClass s=new MyClass();
		
		
		System.out.println(s.find(10));
	
	}
	
	
	public int find(int in)
	{
		int x=0;
		for(int j=1;j<1000;j++)
		{
			if(j/in==0 || j!=in)
			{
				continue;
			
			}
			else
			{
				int num=findsum(j);
						if(num%in==0 && num==in)
						{
							x=num;
						}
			}
			
		}
		return x;
	}
	
	public int findsum(int j)
	{
		int sum=0;
		while (j!=0)
		{
			sum=sum+j%10;
			j=j/10;
			
		}
return sum;
	}
	

}
