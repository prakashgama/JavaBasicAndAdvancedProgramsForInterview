package Algo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,4,5,6};


List<Integer> as=Arrays.stream(a).boxed().toList();

//System.out.println(as.stream().map(x-x<<x).collect(Collectors.toList()));


	}

}
