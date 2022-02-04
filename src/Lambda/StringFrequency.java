package Lambda;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Prakash";
	String str2="Pprakash";
		
		Map<Character, Long> frequency =
	            str.chars()
	               .mapToObj(c -> (char)c)
	               .collect(Collectors.groupingBy(t->t, Collectors.counting()));
		System.out.println(frequency);
		Map<Character, Long> frequency2 =
	            str2.chars()
	               .mapToObj(c -> (char)c)
	               .collect(Collectors.groupingBy(t->t.toString().toUpperCase().toCharArray()[0], Collectors.counting()));

		System.out.println(frequency2);
	}

}
