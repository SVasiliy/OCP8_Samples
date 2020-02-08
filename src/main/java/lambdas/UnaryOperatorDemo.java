package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		String s = "hello";
		StringBuilder sb = new StringBuilder("world");
		UnaryOperator<StringBuilder> uo1 = t -> t.append(s);
		UnaryOperator<String> uo2 = t -> t.toUpperCase();
		
		uo1.apply(sb);
		System.out.println("uo1 result: " + sb);
		
		String locString = sb.toString();
		uo2.apply(locString);
		System.out.println(locString); // print lower, because Strings are immutable

		locString = uo2.apply(locString);
		System.out.println(locString); // print UPPER
		
		
	}

}
