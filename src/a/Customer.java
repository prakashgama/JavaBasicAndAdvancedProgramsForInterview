package a;

public class Customer {

	
	public int id;
	public String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
