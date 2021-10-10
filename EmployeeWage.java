package sample;

public class EmployeeWage {	
	public static void main(String[] args) {
		
		// initialize variable and assign value
		int Is_Full_Time = 1;
		int Is_Part_Time = 2;
		int Emp_Rate_Per_Hour = 20;
		int emp_Hour = 0;
		
		//take the random value
		double checkEmp = Math.floor(Math.random()*10)%3;
		
		// System.out.println("CheckEmp: "+checkEmp);

		//check the condition emp is present or not 
		if(checkEmp == Is_Full_Time) {
			emp_Hour = 8;
			System.out.println("Employee is Full time");
		}
		// part time 2
		else if ( checkEmp == Is_Part_Time) {
			emp_Hour=4;
			System.out.println("Employee is Part Time");
		}
		
		else
			System.out.println("Emplyee is Absent");
		// calculate emp wage
		int empWage = emp_Hour * Emp_Rate_Per_Hour;
		
		// print emp wage
		System.out.println("Employee Wage is : " +empWage);	
	}

}
