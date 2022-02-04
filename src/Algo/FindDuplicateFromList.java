package Algo;
import java.util.*;
import java.util.stream.*;
  
public class FindDuplicateFromList {
  
    // Function to find the
    // duplicates in a Stream
    public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream)
    {
  
        // Set to store the duplicate elements
        Set<T> items = new HashSet<>();
  
        // Return the set of duplicate elements
        return stream
  
            // Set.add() returns false
            // if the element was
            // already present in the set.
            // Hence filter such elements
            .filter(n -> !items.add(n))
  
            // Collect duplicate elements
            // in the set
            .collect(Collectors.toSet());
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Initial stream
        Stream<Integer> stream
            = Stream.of(5, 13, 4,
                        21, 13, 27,
                        2, 59, 59, 34,59);
 
        // Print the found duplicate elements
        System.out.println(
            findDuplicateInStream(stream));
    }
}