package SpingsExample.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import SpingsExample.Beans.Employee;
import SpingsExample.Dao.EmployeeDao;
import SpingsExample.Exception.EmployeeNotFoundException;
import SpingsExample.Exception.InvalidSalaryException;
@Service
public class EmployeeArrayOperationsImple implements employeeOperations {

	private EmployeeDao ed;

	public EmployeeArrayOperationsImple() {
		ed = new EmployeeDao();
	}

	public void addEmployee(Employee e) throws EmployeeNotFoundException, InvalidSalaryException {
		if (e.getSalary() <= 5000) {
			throw new InvalidSalaryException("Salary should greater than 5000 ");
		} else {

			boolean a = ed.employeeInsert(e);
			System.out.println(a);
		}

	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {

		boolean b = ed.deleteEmployee(id);
		System.out.println(b);
		if (b == false)
			throw new EmployeeNotFoundException("Given Employee id is Invalid. Please provide valid employee id ");
	}

	public void updateExistingEmployee(Employee e) throws EmployeeNotFoundException, InvalidSalaryException {
		if (e.getSalary() < 5000) {
			throw new InvalidSalaryException("Salary should greater than 5000 ");
		}

		boolean b = ed.updateAnEmployee(e);
		System.out.println(b);
		if (b == false)
			throw new EmployeeNotFoundException("Given Employeeid is Invalid. Please provide valid employee id");

	}

	public void displayEmployees(Employee e) {

		Employee b = ed.DisplayAnEmployee(e);
		System.out.println("given Employee Does not exist");
	}

	public void displayAllEmployeesInfo() {

		List<Employee> b = ed.DisplayAllEmployee();


	}

	

	
	public void sortBy(String s) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = ed.sortAllEmployee(s);
	}

	public void highestSalary(int salary) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = ed.calculateHighSalary(salary);
	}
	
	public void showSalary() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emp = ed.showEmployeeSalary();
	}

	public void displayEmployeesHra(Employee e) {
		//Employee obj = ed.calculateHra(e.getemployeeID());
		//System.out.println("Employee HRa :  " + EmployeeUtill.calculateHra(obj));

	}

	public void displayEmployeesGrossSalary(Employee e) {

	//	Employee obj = ed.calculateGrossSalary(e.getemployeeID());
		//System.out.println("Employee HRa :  " + EmployeeUtill.calculateHra(obj));

	}

	// public List<Employee> getAllEmployees() {
	// TODO Auto-generated method stub
	// return al;
	// }

	/*
	 * public void getHighestSalary(int salary){ HighSalaryIterator hsi=new
	 * HighSalaryIterator(salary); while(hsi.hasNext()){ Employee
	 * temp=hsi.next(); if(temp!=null) displayEmp(temp); } }
	 * 
	 * public class HighSalaryIterator implements Iterator<Employee>{ int
	 * highSalary; int index=0; public HighSalaryIterator(int highSalary) {
	 * super(); this.highSalary = highSalary; }
	 * 
	 * 
	 * @Override public boolean hasNext() { // TODO Auto-generated method stub
	 * 
	 * return (index <= al.size() - 1); }
	 * 
	 * @Override public Employee next() { // TODO Auto-generated method stub
	 * Employee highSal=al.get(index); if(highSal.getSalary()>highSalary){
	 * index++; return highSal; }else{ index++; return null; } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Override public Employee next(Employee e) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 */
}
