package functionalProgramPract;

public class Closure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
			String name = "Sebas";
			return () -> "Hello, " + name;
		};
		
		NoArgFunction<String> greeter = createGreeter.apply();
		System.out.println(greeter.apply());
		
	}

}
