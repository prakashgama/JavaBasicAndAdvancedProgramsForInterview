package tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
  }
	
	static String readFirstLineFromFile(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}

}
