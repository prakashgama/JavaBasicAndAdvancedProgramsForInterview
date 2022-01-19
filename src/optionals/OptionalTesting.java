package optionals;

import java.util.Optional;

public class OptionalTesting {

	public static void main(String[] args) {  
        String[] words = new String[10];  
        Optional<String> checkNull = 
                      Optional.ofNullable(words[5]);  
        if (checkNull.isPresent()) {  
            String word = words[5].toLowerCase();  
            System.out.print(word);  
        } else  
            System.out.println("word is null"); 
        
        
        System.out.println(Optional.empty());
       
    }  
	
	
}
