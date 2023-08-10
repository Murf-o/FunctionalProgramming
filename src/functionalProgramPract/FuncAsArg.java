package functionalProgramPract;

import java.util.function.BiFunction;

public class FuncAsArg {

	protected static class MyMath{
		public static Integer add(Integer x, Integer y) {
			return x + y;
		}
		public static Integer subtract(Integer x, Integer y) {
			return x - y;
		}
		
		
		public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunction) {
			return combineFunction.apply(2, 3);
		}
		public static Integer TriTest(TriFunction<Integer, Integer, Integer, Integer> combineFunction) {
			return combineFunction.apply(2, 3, 4);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("add: " + MyMath.combine2And3(MyMath::add));
		System.out.println("subtract: " + MyMath.combine2And3(MyMath::subtract));
		
		System.out.println("lambda: " + MyMath.TriTest((x,y,z) -> x+y+z));
		
	}

}
