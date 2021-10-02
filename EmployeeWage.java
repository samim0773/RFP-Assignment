package sample;

public class EmployeeWage {	
	public static void main(String[] args) {
		int emp_Hour;
		final int is_Full_Time = 1;
		final int is_Part_Time = 2;
		int emp_Rate_Pr_Hour= 20;
		
		int emp_Check = (int) Math.floor(Math.random()*3);

		switch(emp_Check) {
			case is_Full_Time:
				System.out.println("Employee is Full Time");
				emp_Hour = 8;
				break;
			case is_Part_Time:
				System.out.println("Employee is Part Time ");
				emp_Hour = 4;
				break;
			default:
				System.out.println("Emloyee is Absent");
				emp_Hour = 0;
		}
		
		int salary = emp_Rate_Pr_Hour * emp_Hour;
		System.out.println("The salary of employee is :" + salary);
	}

}
