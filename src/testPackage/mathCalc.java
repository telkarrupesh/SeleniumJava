package testPackage;

public class mathCalc {
	
	
 public void add(int a, int b)
	{
		int c;
		
		c = a+b ;
		
		System.out.println(c);
		
		
	}
	
	public void sub(int x, int y)
	
	{
		int z = x - y;
		System.out.println(z);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mathCalc obj1 = new mathCalc();
	
		obj1.sub(5,3);
		
		
		
		
		

	}

}
