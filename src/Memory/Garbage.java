package Memory;

/*
link to learn memory management
https://betsol.com/2017/06/java-memory-management-for-java-virtual-machine-jvm/

TO print GC logs :-XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:/gc.log
*/
public class Garbage {

	int s;
	
	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	String f;
	
	

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public static void main(String[] args) {
		
		Garbage g=new Garbage();
		System.out.println(g.getS());
		System.out.println(g.getF());
			
	}
	
	
}
