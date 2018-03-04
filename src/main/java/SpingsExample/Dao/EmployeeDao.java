package SpingsExample.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import SpingsExample.Beans.Employee;
import SpingsExample.Services.AppContext;
@Repository
public class EmployeeDao {
	
	public EmployeeDao() {
		
		
	}

	public boolean employeeInsert(Employee e) {
		try {
			
			ApplicationContext context=AppContext.appContext();
			DataSource ds=(DataSource) context.getBean(DBConnection.class);
			Connection con=ds.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employees VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, e.getEmployeeID());
			pst.setString(2, e.getEmpName());
			pst.setInt(3, e.getAge());
			pst.setInt(4, e.getSalary());
			pst.setString(5, e.getAddress());
			pst.setString(6, e.getCity());
			pst.setString(7, e.getState());
			pst.setString(8, e.getCountry());
			pst.setDouble(9, e.getPhoneNumber());
			pst.setInt(10, e.getZipCode());
			pst.setObject(11, e.getDepartment());
			pst.execute();
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;

	}

	/*public boolean deleteEmployee(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("delete from employees where employeeId=?");
			pst.setInt(1, e);
			if (pst.executeUpdate() == 1) {
				return true;
			} else
				return false;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

		return false;
	}

	public boolean updateAnEmployee(Employee e) {
		try {
			PreparedStatement pst = con
					.prepareStatement("update  employees SET empName=?,empSalary=?,empAge=? where employeeId=?");
			pst.setString(1, e.getEmpName());
			pst.setInt(1, e.getSalary());
			pst.setInt(1, e.getAge());
			if (pst.executeUpdate() == 1) {
				return true;
			} else
				return false;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

		return false;
	}

	public Employee DisplayAnEmployee(Employee e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e.getEmployeeID());
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> DisplayAllEmployee() {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees");
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			
			return user;

		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> sortAllEmployee(String sortBy) {

		try {
			PreparedStatement pst = null;
			if (sortBy.equalsIgnoreCase("Namesalary"))
				pst = con.prepareStatement("select * from employee ORDER BY empName,empSalary");
			else if (sortBy.equalsIgnoreCase("salary"))
				pst = con.prepareStatement("select * from employee ORDER BY empSalary");
			else if (sortBy.equalsIgnoreCase("ID"))
				pst = con.prepareStatement("select * from employee ORDER BY empId");
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			return user;

		} catch (Exception e) {
			e.getMessage();
			return null;
		}

	}

	public Employee calculateHra(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public Employee calculateGrossSalary(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> calculateHighSalary(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where empSalary>?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			return user;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	
	public ArrayList<Employee> showEmployeeSalary() {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where empSalary>?");
			pst.setInt(1, 5000);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			return user;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}
*/
}
