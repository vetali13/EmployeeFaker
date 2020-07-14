import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class Company {
	private static List<Employee> employees;
	  
    public static void generate(int counter) {
    	employees = new ArrayList<>();
    	int i = 0;
    	Faker faker = new Faker();
    	while (i++ < counter) {
    		String name = faker.name().fullName();
    		float salary = (float)faker.number().randomDouble(0, 10000, 20000);
    		float experience = (float)faker.number().randomDouble(0, 3, 15);
    		Employee employee = new Employee(name, salary, experience);	
    		employees.add(employee);
    	}
    }

    public static void printAllCompact() {
        employees.forEach(
        	e->System.out.println((employees.indexOf(e) + 1) + ". " + e.getFullName())
        );
    }

    public static void printAllDetailed() {
    	employees.forEach(
            	e-> {
            		String s = employees.indexOf(e) + 1 + ". ";
            		s += e.getFullName() + " ";
            		s += String.valueOf(e.getSalary()).split("\\.")[0] + "$" + " ";
            		s += String.valueOf(e.getExperience()).split("\\.")[0] + " years";
            		System.out.println(s);
            	}
            );
    }
}
