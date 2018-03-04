package SpingsExample.Beans;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private String deptName;
	private int deptNo;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

}