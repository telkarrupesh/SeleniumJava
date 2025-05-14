package testPackage;

public class DataTypes {

	
	/*
	 * 
	 * premitive data types
	 * Integers - byte, short, int, long //
	 * Decimals : float, double
	 * Character: char
	 * true/false - boolean
	 * 
	 * 
	 * 
	 * 
	 * Non premitive data types
	 * 
	 * string
	 * 
	 * 
	 */
	
	static byte minValue = -128;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(minValue);
		
		char c = '*';
		boolean x = true;
		boolean y = false;
		
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		
		String a = "Hello World"; 
		String b = "Good Morning";
		
		System.out.println(a.concat(b));
		System.out.println(1+2);
		
		String firstName = "Rupesh";
		String lastName = "Telkar";
		
		System.out.println(firstName.concat(lastName));
		
		String fullName = firstName.concat(lastName);
		
		System.out.println(fullName.charAt(5));
		
		
		
	
	

	}

}
