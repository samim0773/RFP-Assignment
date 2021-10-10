package sample;
		
public class EmployeeWage {	
	// global constant variable
	public static final int is_Part_Time = 1;
	public static final int is_Full_Time = 2;
	public static final int emp_Rate_Per_Hour = 20;
	public static final int num_Of_Working_Days = 2;
	public static final int max_Hour_In_Month = 10;
			
	public static void main(String[] args) {
		// 
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	
		// check total emp hour is less than 100 and total working day less than 20
		while( totalEmpHrs<=max_Hour_In_Month && totalWorkingDays  < num_Of_Working_Days ){
		
		// increment total working days
		totalWorkingDays++;
		
		//generate random value and type casting double to int
		int empCheck = (int) Math.floor(Math.random()* 10)  % 3;
		
			// choose 0 , 1, 2
			switch (empCheck) {
			
				// for full time 2
				case is_Full_Time:
					empHrs = 8;
					break;
					
				// part time 1
				case is_Part_Time:
					empHrs = 4;
					break;
					
				// emp hrs 0 bec emp absent
				default:
					empHrs = 0;
			}
					// emphrs store to totalEMp
					totalEmpHrs += empHrs;
					System.out.println("Day :" + totalWorkingDays + " Emp Hr: " + empHrs);				
		}             
				int totalEmpWage = totalEmpHrs * emp_Rate_Per_Hour; 
				System.out.println("Total Emp Wage :" + totalEmpWage);	
	}
		
}
		
