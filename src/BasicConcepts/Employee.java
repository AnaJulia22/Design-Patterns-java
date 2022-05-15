package BasicConcepts;

public class Employee {
	
	int id;
	String name;
	double salary;
	int grade;
	String company = "IBM";
	
	Email email;
	
	public Employee(int id, String name, Email email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void notifyEmployee() {
		email.sendEmail();
	}

	public int getGrade() {
		return grade;
	}
}
