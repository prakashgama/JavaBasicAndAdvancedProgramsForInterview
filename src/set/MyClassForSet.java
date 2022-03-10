package set;

import java.util.Objects;

public class MyClassForSet implements Comparable<Object>{
	
	private int id;
	private String name;
	public MyClassForSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public MyClassForSet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyClassForSet [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClassForSet other = (MyClassForSet) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
