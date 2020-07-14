import java.util.List;

import com.github.javafaker.Faker;

public class Application {

	public static void main(String[] args) {
	
		Company company = new Company();
		
		company.generate(10);
		
		company.printAllDetailed();
		
	}

}
