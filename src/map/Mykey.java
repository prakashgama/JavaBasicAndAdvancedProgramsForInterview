package map;

public class Mykey implements Comparable<Mykey> {

	
	private int id;
	
	private String name;

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
	public int hashCode() {
		
		  final int prime = 31; int result = 1; result = prime * result + id; result =
		  prime * result + ((name == null) ? 0 : name.hashCode());
		 
		return result ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mykey other = (Mykey) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Mykey(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mykey [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Mykey o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
		
	}
	
	
	
	
}
