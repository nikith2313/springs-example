package SpingsExample.Exception;

public class InvalidSalaryException extends RuntimeException {

	public InvalidSalaryException(String s) {
		super(s);
		System.out.println("Salary should greater than 5000 ");
	}
}
