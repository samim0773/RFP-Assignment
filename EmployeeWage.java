package sample;

public class EmployeeWage {	
	public static void main(String[] args) {
		int Is_Full_Time = 1;
		int Is_Part_Time = 2;
		int Emp_Rate_Per_Hour = 20;
		int emp_Hour = 0;
		
		//take the random value 
		double checkEmp = Math.floor(Math.random()*10)%3;
		
		if(checkEmp == Is_Full_Time) {
			emp_Hour = 8;
			System.out.println("Employee is Full time");
		}
		else if ( checkEmp == Is_Part_Time) {
			emp_Hour=4;
			System.out.println("Employee is Part Time");

		}	
		else {
			System.out.println("Emplyee is Absent");	
		}	
		int empWage = emp_Hour * Emp_Rate_Per_Hour;
		System.out.println("Employee Wage is : " +empWage);	

	}

}

