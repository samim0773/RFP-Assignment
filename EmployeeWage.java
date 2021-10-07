package sample;

public class EmployeeWage {	
	public static void main(String[] args) {

		final int is_Full_Time = 1;
		final int is_Part_Time = 2;
		final int emp_Rate_Per_Hour = 20;
		int total_Salary = 0;
		int working_Days = 20;
		int emp_Hour = 0;
		for(int i=0; i<=working_Days; i++){
			
			int emp_Check = (int) Math.floor(Math.random()*3);

			switch(emp_Check) {
				case is_Full_Time:
					emp_Hour = 8;
					break;
				case is_Part_Time:
					emp_Hour = 4;
					break;
				default:
					emp_Hour = 0;
			}
			
			int salary = emp_Rate_Per_Hour*emp_Hour;
			
			total_Salary += salary;
		}
	
		System.out.println("Monthly salary of employee is : " + total_Salary);
     	
		int salary = emp_Rate_Per_Hour * emp_Hour;
		System.out.println("The salary of employee is :" + salary);

	}

}

