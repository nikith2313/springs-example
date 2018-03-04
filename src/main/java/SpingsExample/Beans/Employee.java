package SpingsExample.Beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee{

	private int employeeID;
	private String empName;
	static String companyName;
	private int age;
	private int salary;
	private String address;
	private String city;
	private String state;
	private String country;
	private int zipCode;
	private double phoneNumber;
	
	@Autowired
	private Department department;

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmpName() {
		return empName;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public int getAge() {
		return age;
	}

	

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public Department getDepartment() {
		return department;
	}

}
