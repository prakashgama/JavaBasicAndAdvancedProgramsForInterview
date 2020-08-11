package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaLinst {

	public static void main(String[] args) {
		
		
		List<String> t=new ArrayList();
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");
		t.add("prakash");
		t.add("akash");
		t.add("robin");
		t.add("raj1");

		int batchSize = 2;
		final AtomicInteger counter = new AtomicInteger();
		 Collection<List<String>> inventoriesBatchSizeList = t.stream()
		        .collect(Collectors.groupingBy(it -> counter.getAndIncrement()/batchSize)).values();
int count =0;
		 System.out.println(inventoriesBatchSizeList);
		 for(List<String> l:inventoriesBatchSizeList)
		 {
	
		 }
	}

}
