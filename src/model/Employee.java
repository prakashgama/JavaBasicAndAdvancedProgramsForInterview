package model;

public class Employee {
	
	
	
	public String name;
	
	public String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	
	public Employee()
	{
		
	}

}
