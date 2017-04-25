package Techm;

public class Employee 
{
	private int empNo;
	private String empName;
	private int empSal;
	
	
	
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	
	public Employee(int empNo, String empName, int empSal) {
		this.empNo = 123;
		this.empName = "Manjiri";
		this.empSal = 25000;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}

	
}
