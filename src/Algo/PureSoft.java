package Algo;

import java.util.*;


public class PureSoft {

	public static void main(String[] args) {
		// TODO Auto-generaList<A>method stub

		Employee c=new Employee();
		c.setId(1);
		c.setName("prakashs");
		Employee d=new Employee();
		d.setId(2);
		d.setName("soni");
		
		
		List<Employee> e=new ArrayList<Employee>();
		
		e.add(d);
		e.add(c);
		
		System.out.println(e.stream().sorted().toList());
		
		
		
		
		
	}

}

class Employee implements Comparable<Employee>
{
	public int id;
	public String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.id>(o.getId()))
				return 1;
		else if(this.id<(o.getId()))
			return -1;
			else 
			return	0;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}


