package enhancements;

/*
 * Java Literals are syntactic representations of boolean, character, numeric, or string data.
 * Literals provide a means of expressing specific values in your program.
 * For example, in the following statement, an integer variable named count is declared and assigned an integer value. 
 * The literal 0 represents, naturally enough, the value zero.
 * 
 * int count = 0;
 */

public class Literals {

	public static void main(String[] args) {

		int int_decimal = 1995;
		int int_octal = 01715; // leading 0, 0-7 values allowed
		int int_hex = 0xAEF_0151A; // leading 0x, 0-9 + A-F values allowed
		
		System.out.println("int_decimal: " + int_decimal);
		System.out.println("int_octal (value 01715): " + int_octal);
		System.out.println("int_hex (value 0xAEF_0151A): " + int_hex);
		

		float float_int = 156_51f;
		System.out.println("float_int: " + float_int);

		double double_int = 15651d;
		System.out.println("double_int: " + double_int);
	
	    // binary literals
		int i=0b0111;
		byte b=(byte) 0b0111;
		long l=(long) 0B0111L;
		System.out.println("i="+i);
		System.out.println("b="+b);
		System.out.println("l="+l);
	}

}
