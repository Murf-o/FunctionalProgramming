package functionalProgramPract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Maps {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(arr));
		
		
//		List<Integer> doubled = new ArrayList<>();
//		for(int i = 0; i < listOfIntegers.size(); ++i) {
//			Integer result = listOfIntegers.get(i) * 2;
//			doubled.add(result);
//		}
		
		Function<Integer, Integer> timesTwo = (x) -> x*2;
		
		List<Integer> doubled = listOfIntegers.stream()
								.map(timesTwo)
								.collect(Collectors.toList());
		
		System.out.println(doubled);
	}

}
