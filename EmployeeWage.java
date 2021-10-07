package sample;

public class EmployeeWage {	
	public static final int is_Part_Time = 1;
	public static final int is_Full_Time = 2;
	public static final int emp_Rate_Per_Hour = 20;
	public static final int num_Of_Working_Days = 2;
	public static final int max_Hour_In_Month = 10;
	
	public static void main(String[] args) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while( totalEmpHrs<=max_Hour_In_Month && totalWorkingDays  < num_Of_Working_Days ){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()* 10)  % 3;
			
			switch (empCheck) {
				case is_Full_Time:
					empHrs = 8;
					break;
				case is_Part_Time:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day :" + totalWorkingDays + " Emp Hr: " + empHrs);
			
		}

                      
		int totalEmpWage = totalEmpHrs * emp_Rate_Per_Hour; 
		System.out.println("Total Emp Wage :" + totalEmpWage);
       

	}

}

