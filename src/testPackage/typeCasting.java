package testPackage;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * byte
		 * short
		 * int
		 * long
		 * 
		 * float
		 * double
		 * 
		 * char
		 * string
		 * 
		 * boolean
		 * 
		 */
		
		int a = (int) 45.44;
		System.out.println(a);
		
		float b = (int) 45.44f;
		
		System.out.println(b);
		
		long sid = 9223372036854L;
		
		System.out.println(sid);
		
		int d = (int) sid ;
		
		System.out.println(d);
		
		short e = 128;
		
		byte f = (byte) e;
		
		System.out.println(f);
		
		
		
		float x = 300.99f;
		
		int y = Math.round(x);
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		/* wrapper classes
		 * class represents premitive data types
		 * 
		 * we have 8 wrapper classes
		 * every premitive data type has its own wrapper class
		 * 
		 * Byte,Short,char,int,long,float,double,boolean
		 * 
		 */
		
		
		
		int i1 = 9619;
		// converting non premitive to premitive by using integer.tostring
		String s1 = Integer.toString(i1);
		
		System.out.println(i1);
		System.out.println(s1);
		
		System.out.println(i1+3);
		System.out.println(s1+3);
		
	System.out.println("helloworld"+20+30);	
	System.out.println(20+30+"helloworld"+20+30);	
	System.out.println(20+30+"helloworld"+(20+30));	
	
	
	String s2 = "123";
	int i2 = Integer.parseInt(s2);
	
	System.out.println(s2);
	System.out.println(i2);
	
	
/*	Assignment
 * 
 * try all the conversions from string to all premitive data types
 * 
 * 
 * 
 */
	
	String s3 = "96199999" ;
	
//	byte b1 = Byte.parseByte(s3);
//	System.out.println(b1);
	
	long l2 = Long.parseLong(s3);
	System.out.println(s3);
	
	float f2 = Float.parseFloat(s3);
	System.out.println(f2);
	
	double d2= Double.parseDouble(s3);
	System.out.println(d2);
	
	String s4= Double.toString(d2);
	System.out.println(s4);
	
	System.out.println(s4+144);
	
	
	
	
int i3 = 6;

System.out.println(i3);
	
byte b3 = (byte) i3;
System.out.println(b3);
	
	
 	
	
	
		
		
		
		
		

	}

}
