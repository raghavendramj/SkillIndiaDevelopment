public class Employee{
	private int empId;
	private String empName;
	private String email;
	
	// -> public Employee(Parameters => ParamDataType paramVariableName, .... )
	public Employee(int id, String name, String emailId){
		this.empId = id;
		this.empName = name;
		this.email = emailId;
	}

	
	public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
	
	public static void main(String args[]){		
		Employee emp1 = new Employee(12, "Adam", "adam@gmail.com");
		Employee emp2 = new Employee(13, "John", "john@hotmail.com");		
		
		System.out.println("Employee 1 -> "+ emp1);
		System.out.println("Employee 2 -> "+emp2);
	}	
}