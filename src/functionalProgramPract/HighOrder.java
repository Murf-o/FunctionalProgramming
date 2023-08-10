package functionalProgramPract;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HighOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CLUTTERED because of argument checking logic
		BiFunction<Float, Float, Float> divideCheck = (x,y) -> {
			if(y == 0) {
				System.out.println("Cannot divide by zero");
				return 0f;
			}
			return x/y;
		};
		/////////////////////////////////////////////
		
		
		
		
		Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
				(func) -> (x, y) ->{
					if(y == 0f) {
						System.out.println("Second arg is zero");
						return 0f;
					}
					//func needs to return Float
					return func.apply(x, y);
				};//essentially returning func as is here
					
				BiFunction<Float, Float, Float> divide = (x,y) -> x/y;
				BiFunction<Float, Float, Float> divideCorrect = secondArgIsntZeroCheck.apply(divide);
				System.out.println(divideCorrect.apply(4f, 0f));
				System.out.println(divideCorrect.apply(4f, 2f));
	}

}
