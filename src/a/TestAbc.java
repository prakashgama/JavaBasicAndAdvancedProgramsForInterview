package a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestAbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		divisiablByThree(33);
	}
	
	public static void divisiablByThree(int a)
	{
		boolean check=true;
		boolean check1=true;
		boolean check2=true;
		for(int i=1;i<=a;i++)
		{
			if(check)
			{
				check=false;
			}else {
				if(check1)
				{
					check1=false;
				}
				else
				{
					check2=false;
				}
			}
			if(!check2 && !check1 && !check)
			{
				 check=true;
				 check1=true;
				 check2=true;
			}
			
		}
		if(check && check1 && check2)
		{
			System.out.println(true);
		}
		else 
			System.out.println(false);
		
	}

}

