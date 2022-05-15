package BasicConcepts;

public class TestEmployee {

	public static void main(String[] args) {
		
		Email email = new OutlookEmail();
		Employee obj1 = new Employee(1, "Júlia", email);
		obj1.notifyEmployee();

		email = new WebserviceEmail();
		Employee obj2 = new Employee(2, "Beatriz", email);
		obj2.notifyEmployee();
	}

}
