package cars;

public class EmployeeDetails {
	    public void printEmployeeName(String empName, int empId) {
		System.out.println("The Employee Name and ID is : "+empName+", "+empId);
		}
	    public void getEmployeeAddress(String empAddress) {
	    	System.out.println("The Employee Address is : "+empAddress);
	    	    }
	    private void printEmployeeSalary(double empSalary) {
			System.out.println("The Employee Salary is : "+empSalary);
		} 
	    public void printEmployeeMobileNumber(long mobNum) {
			System.out.println("The Employee Mobile Number is : "+mobNum);
		}
	    public static void main(String[] args) {
			EmployeeDetails employeeDetailObject = new EmployeeDetails();
			employeeDetailObject.printEmployeeName("Saranya",1001001);
			employeeDetailObject.getEmployeeAddress("Chennai");
			employeeDetailObject.printEmployeeSalary(56000.78);
			employeeDetailObject.printEmployeeMobileNumber(989889899L);
		}
}
