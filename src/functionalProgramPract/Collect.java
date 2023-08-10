package functionalProgramPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Hello", "awesome!", "bike", "hi", "sjwodjwoidjqow", "bye", "yellow", "bo"};
		
		String filteredWords = Arrays.asList(words).stream()
				.filter((str) -> str.length() > 5)
				.collect(Collectors.joining(", "));
		
		
		
		Long howMany = Arrays.asList(words).stream()
				.filter((str) -> str.length() > 5)
				.collect(Collectors.counting());
		
		System.out.println(filteredWords);
		System.out.println(howMany);
		
		Map<Integer, List<String>> hash = Arrays.asList(words)
				.stream()
				.collect(Collectors.groupingBy(
						(word) -> word.length()
				));
		
		System.out.println(hash);
		System.out.println();
		
		Map<Boolean, List<String>> part = Arrays.asList(words)
				.stream()
				.collect(Collectors.partitioningBy(
						(word) -> word.length() > 4
				));
		System.out.println(part);
	}

}
