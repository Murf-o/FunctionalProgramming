package functionalProgramPract;

public class Two {

	protected static class Person{
		private String name;
		private Integer age;
		
		public Person(String name, Integer age) {
			this.age = age;
			this.name = name;
		}
	}
	
	
	protected static class DataLoader{
		
		public final NoArgFunction<Person> loadPerson;
		
		public DataLoader(Boolean isDevelopment) {
			if(isDevelopment) 
				loadPerson = this::LoadPersonFake;
			else
				loadPerson = this::LoadPersonReal;
		}
		
		private Person LoadPersonReal() {
			System.out.println("Loading person...");
			return new Person("Real person", 30);
		}
		
		private Person LoadPersonFake() {
			System.out.println("Returning Fake Person");
			return new Person("Fake Person", 900);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Boolean IS_DEVELOPMENT = true;
		
		DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
		Person p = dataLoader.loadPerson.apply();
		System.out.println(p.name + ", " + p.age);
		
	}

}
