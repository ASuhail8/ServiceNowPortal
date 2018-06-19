package practice;

public class EmployeeData 
{

	private int ssn;
	private String empName;
	private int empNo;
	
	
	public static void main(String[] args)
	{
	
		EmployeeData emp = new EmployeeData();
		emp.setssn(123456);
		emp.setEmpNo(290841);
		emp.setEmpName("Suhail");
		
		System.out.println("Employee name is :"+emp.getEmpName());
		System.out.println("Employee ssn is :"+emp.getssn());
	System.out.println("Employee no is :"+emp.getEmpNo());
	}

	public int getssn()
	{
		return ssn;
	}
	
	public void setssn(int ssn)
	{
		this.ssn=ssn;
	}

	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	
	
}
