package Algo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> originalList = Arrays.asList("Red", "Blue", "Indigo", "Green","Orange","Violet");
		
	    System.out.println("Original List: " + originalList);

	    System.out.println(originalList.stream()
	                                          .map(Colours::valueOf).collect(Collectors.toList()));
	    List<String> sortedList = originalList.stream()
	                                          .map(Colours::valueOf)
	                                          .sorted(Colours::compareTo)
	                                          .map(Colours::toString)
	                                          .collect(Collectors.toList());

	    System.out.println("Sorted List: " + sortedList);
	}


}

enum Colours {
	Violet("V"),
	Indigo("I"),
	Blue("B"),
    Green("G"),
    Yellow("Y"),
    Orange("O"),
    Red("R");
    
	private String test;
    private Colours(String test)
    {
		this.test=test; 
    }
    public String getValue()
    {
    	return this.test;
    }
}

