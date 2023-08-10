package functionalProgramPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(arr));
		
		
		BinaryOperator<Integer> getSum = (acc, x) -> {
			Integer result = acc + x;
			System.out.println("acc: " + acc + " x: " + x + " result: " + result);
			return result;
		};
		Integer sum = listOfIntegers
						.stream()
						.reduce(0, getSum);
		System.out.println(sum);
		
		BinaryOperator<Integer> getOddSum = (acc, x) -> {
			if(x % 2 == 1) {
				return acc + x;
			}
			return acc;
		};
		
		Integer oddSum = listOfIntegers
							.stream()
							.reduce(0, getOddSum);
		System.out.println(oddSum);
	}

}
