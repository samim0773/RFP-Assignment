package sample;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// initialize and declar a emp_is_present variable 
		int emp_is_present=1;
				
		//take the random value
		double checkEmp = Math.floor(Math.random()*10)%2;
//		System.out.println("CheckEmp: "+checkEmp);

		//check the codition emp is present or not 
		if(checkEmp == emp_is_present)
		{
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Emplyee is Absent");
	}

}
