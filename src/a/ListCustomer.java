package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Customer> s=new ArrayList<Customer>();
		Customer a=new Customer();
		Customer b=new Customer();
		
		a.setId(1);
		a.setName("Prakash");
		b.setId(2);
		b.setName("akash");
		
		s.add(a);
		s.add(b);
		
		System.out.println(s.stream().collect(Collectors.toMap(d->d.getName(),z->z)));
		/*
		 * Map<String, Customer> c=
		 * s.stream().collect(Collectors.toMap(StringBuilder::new(Customer::getId),
		 * Function.identity() ));
		 */
	//System.out.println(c);
	}
	

}
