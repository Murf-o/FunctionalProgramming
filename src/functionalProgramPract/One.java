package functionalProgramPract;

import java.util.function.BiFunction;
import java.util.function.Function;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> doubleIt = (arg) -> arg*2;
		System.out.println("doubleIt: " + doubleIt.apply(3));
		
		BiFunction<Integer, Integer, Integer> sumTwo = (numOne, numTwo) -> numOne+numTwo;
		System.out.println("sumTwo: " + sumTwo.apply(3, 10));
		
		TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x+y+z;
		System.out.println("addThree: " + addThree.apply(3, 2, 9));
		
		NoArgFunction<String> myHelloWorld = () -> "hello world!";
		System.out.println("noArg: " + myHelloWorld.apply());
		
		
	}

}
