package lambdas;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class ComplexLambdaExample {

	public static int operate( IntUnaryOperator iuo){
		return iuo.applyAsInt(5);
	}
	
	public static void main( String[] args){
	
		IntFunction<IntUnaryOperator> fo = a -> b -> a - b;
		int x = operate( fo.apply(20));

		System.out.println(x);
	}
	
}
