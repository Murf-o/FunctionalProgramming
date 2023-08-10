package functionalProgramPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(arr));
		
		
		Predicate<Integer> isOdd = (x) -> x%2 == 1;
		
		List<Integer> filtered = listOfIntegers.stream()
				.filter(isOdd)
				.collect(Collectors.toList());
		//OR
//		List<Integer> filtered = listOfIntegers.stream()
//				.filter((x) -> x%2 == 1)
//				.collect(Collectors.toList());
		
		System.out.println(filtered);
		
		String[] words = {"Hello", "awesome!", "bike", "hi", "sjwodjwoidjqow", "bye", "yellow"};
		Predicate<String> shorterThanFive = (str) -> str.length() < 5;
		
		List<String> filteredWords = Arrays.asList(words).stream()
										.filter(shorterThanFive)
										.collect(Collectors.toList());
		System.out.println(filteredWords);
		
		Function<Integer, Predicate<String>> createLengthTest = (maxLength) -> {
			return (str) -> str.length() < maxLength;
		};
		
		Predicate<String> shorterThan4 = createLengthTest.apply(4);
		
		List<String> wordsLess4 = Arrays.asList(words).stream()
				.filter(shorterThan4)
				.collect(Collectors.toList());
		
		System.out.println(wordsLess4);
	}

}
