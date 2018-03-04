package SpingsExample.Services;

import SpingsExample.Beans.Employee;
import SpingsExample.Exception.EmployeeNotFoundException;

public interface employeeOperations {
	public void addEmployee(Employee e) throws EmployeeNotFoundException;

	public void deleteEmployee(int id) throws EmployeeNotFoundException;

	public void updateExistingEmployee(Employee e) throws EmployeeNotFoundException;

	public void displayEmployees(Employee e);

	public void displayAllEmployeesInfo();


}
