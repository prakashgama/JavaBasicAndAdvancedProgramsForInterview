package finalPack;

public class TestFianl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FianlClass a=new FianlClass();
	a.setA("akash");
	
	System.out.println(a.getA());
		
	FianlClass b=a;
	b.setA("akash");
	
	System.out.println(b.getA());
		
	}

}
