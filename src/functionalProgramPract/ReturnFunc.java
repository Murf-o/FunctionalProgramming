package functionalProgramPract;

import java.util.function.Function;

public class ReturnFunc {
	
	protected static class MyMath{
		
		//REPITITION
//		public static Integer timesTwo(Integer x) {
//			return x*2;
//		}
//		public static Integer timesThree(Integer x) {
//			return x*3;
//		}
//		public static Integer timesFour(Integer x) {
//			return x*4;
//		}
		
		//INSTEAD
		public static Function<Integer, Integer> createMultiplier(Integer y){
			return (Integer x) -> x * y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgFunction<NoArgFunction<String>> createGreeter = () ->{
			return () -> "Function Factory!";
		};
		
		//or
		//NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Function Factory!";
		
		
		NoArgFunction<String> greeter = createGreeter.apply();
		System.out.println(greeter.apply());
		
		Function<Integer, Integer> timesTwenty = MyMath.createMultiplier(20);
		Function<Integer, Integer> timesHundred = MyMath.createMultiplier(100);
		
		System.out.println("Twenty: " + timesTwenty.apply(5));
		System.out.println("Hundred: " + timesHundred.apply(5));
	}

}
