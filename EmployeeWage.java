package sample;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
        //******************** UC:1 - Check Emp is present or absent ***************
		
		// initialize and declare a emp_is_present variable 
		int emp_is_present=1;
				
		//take the random value
		double checkEmp = Math.floor(Math.random()*10)%2;
        //		System.out.println("CheckEmp: "+checkEmp);

		//check the condition emp is present or not 
		if(checkEmp == emp_is_present)
		{
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Emplyee is Absent");
		
		//************************ UC:2- Calculate Daily Emp Wage *********************************
		
		   // declare variable and initialize value
			
		   int Wage_Per_Hour = 20;
		   int Full_Day_Hour = 8;
					
		   // calculate daily wage
		   int total_Wage = Wage_Per_Hour * Full_Day_Hour;
					
		   //Print total Wage per Day
		   System.out.println("Daily Employee Wage : " + total_Wage);
		
       
		
	}

}
