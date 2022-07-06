package employeecomoutation;

public class employeewage 
{
	public static void CalculateWage(String CompanyName, int wagePerHrs, int maxWorkingDays , int maxWorkingHrs )
{	
	final int PartTime=1;
    final int FullTime=2;
		int totalwage =0;
		int workingHrs=0;
		
		for(int day=1, totalWorkingHours =0; day <= maxWorkingDays && totalWorkingHours < maxWorkingHrs; day++ )
		{
			int employeeCheck=(int) (Math.random() * 10)%3;
				
		switch(employeeCheck) 
		{
		case FullTime:
			System.out.println("Employee is present as 'FULLTIME' ");
			workingHrs=8;
			break;
		case PartTime:
			System.out.println("Employee is present as 'PARTTIME' ");
			workingHrs=4;
			break;
		default:
			System.out.println("Employee is absent");
		}
		int employeeWage = workingHrs*wagePerHrs;
		totalwage = totalwage+employeeWage;
		totalWorkingHours = totalWorkingHours + workingHrs;
		System.out.println("Employee Daily wages is as per working hour " + employeeWage + " total working hours "+ totalWorkingHours);
		}
		System.out.println("Company name " + CompanyName +"Total Wage for a month "+ totalwage);
}
public static void main(String[] args) {
	CalculateWage("BridgeLabz" ,20 , 20 ,100);
	CalculateWage("Flipkart" , 25 ,18, 90);
	CalculateWage("Accenture" ,28 ,18 ,80);
	CalculateWage("GOOGLE" ,30 ,20 ,75);
	
	
}

}