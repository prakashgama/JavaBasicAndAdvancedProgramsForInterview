package tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		main(args,"pk");
		test();
		
		
  }
	public static void main(String[] argss,String s) throws Exception  {
		// TODO Auto-generated method stub

		test();
		
		
  }
	static String readFirstLineFromFile(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}
	
	public static void test() throws Exception
	{
		try {
			System.out.println("Test");
		}
		finally {
			System.out.println("Test Successful");
		}
	}

}
