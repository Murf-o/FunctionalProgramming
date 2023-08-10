package functionalProgramPract;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class ParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wordsArr = {"Hello", "awesome!", "bike", "hi", "sjwodjwoidjqow", "bye", "yellow"};
		List<String> words = new ArrayList<String>(Arrays.asList(wordsArr));
		
		List<String> processedWords = words
									  .parallelStream()
									  .map( (word) -> {
										  System.out.println("Uppercasing " + word);
										  return word.toUpperCase();
									  })
									  .map( (word) -> {
										  System.out.println("Adding exclamation point to " + word);
										  return word + "!";
									  })
									  .collect(Collectors.toList());
		System.out.println(processedWords);
		
	}

}
