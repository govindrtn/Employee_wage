package employeecomoutation;

public class employeewage 
{
	public static final int PartTime=1;
	public static final int FullTime=2;
	
	public int wagePerHrs;
	public int maxWorkingDays;
	public int maxWorkingHrs;
	public String Company;
	
	
	public employeewage(String CompanyName, int wagePerHours , int maxWorkingDays, int maxWorkingHours) {
		this.Company = CompanyName;
		this.wagePerHrs = wagePerHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHours;
	}

	public void CalculateWage(){
		
			int totalwage =0;
			int workingHrs=0;
	
		for(int day=1, totalWorkingHours =0; day <= maxWorkingDays && totalWorkingHours < maxWorkingHrs; day++ )
		{
			int employeeCheck=(int) (Math.random() * 10)%3;
				
		switch(employeeCheck) 
		{
		case FullTime:
			System.out.println("Employee is Present as 'FULLTIME' ");
			workingHrs=8;
			break;
		case PartTime:
			System.out.println("Employee is Present as 'PARTTIME' ");
			workingHrs=4;
			break;
		default:
			System.out.println("Employee is Absent ");
		}
		int employeeWage = workingHrs*wagePerHrs;
		totalwage = totalwage+employeeWage;
		totalWorkingHours = totalWorkingHours + workingHrs;
		System.out.println("Employee Daily wages is as per working hour " + employeeWage + " total working hours "+ totalWorkingHours);
		}
		System.out.println("Company name " + Company +" Total Wage for a month "+ totalwage);
}
public static void main(String[] args){
	
	employeewage apple = new employeewage("Apple" , 20 ,20 ,100);
	apple.CalculateWage();
	employeewage google = new employeewage("Google" , 50 ,15 ,50);
	google.CalculateWage();

 }

}