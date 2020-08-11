package model;

public class User {

	String name;
	
	String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public User(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
		
	}

	@Override
	public String toString() {
		return  name +","+ age+"\n";
	}
	
	
}
