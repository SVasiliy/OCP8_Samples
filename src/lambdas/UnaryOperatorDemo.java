package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		String a = "hello";
		StringBuilder sb = new StringBuilder("world");
		UnaryOperator<StringBuilder> uo1 = s -> s.append(a);
		UnaryOperator<String> uo2 = s -> s.toUpperCase();
		
		uo1.apply(sb);
		
		System.out.println("result: " + sb);
		
		String ms = sb.toString();
		uo2.apply(ms);
		
		System.out.println(ms); // print lower, because Strings are immutable
		
	}

}
