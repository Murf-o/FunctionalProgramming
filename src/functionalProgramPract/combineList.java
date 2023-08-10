package functionalProgramPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class combineList {
	
	static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
        
//        BinaryOperator<Float> getSum = (acc, i) -> {
//        	return acc + i;
//        };
        
        Float totalDeveloperSalaries = employees
        								.stream()
        								.filter( (e) -> e.jobTitle == "developer")
        								.map( (e) -> e.salary)
        								.reduce(0f, (acc, i) -> acc + i);
        
        System.out.println(totalDeveloperSalaries);
        
        Long numberOfDevelopers = employees
        						  .stream()
        						  .filter((e) -> e.jobTitle == "developer")
        						  .collect(Collectors.counting());
        Float avgDevSalary = totalDeveloperSalaries/numberOfDevelopers;
        
        System.out.println(avgDevSalary);
	}

}
