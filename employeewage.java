package employeecomoutation;

public class employeewage {
	
	public static final int PartTime = 1;
	public static final int FullTime = 2;
    public int wagePerHrs;
	public int maxWorkingDays; 
	public int maxWorkingHrs;
	
	public employeewage(int wagePerHours , int maxWorkingDays , int maxWorkingHrs) {
		
		this.wagePerHrs = wagePerHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
		
	}
	public static void getEmployeeWageFunction() 
	{
		  int totalwage = 0;
	      int workingHrs = 0;

	      employeewage myObj = new employeewage(20,20,100); 
	      
	      for(int day = 1, totalWorkingHours = 0; day <= myObj.maxWorkingDays && totalWorkingHours < myObj.maxWorkingHrs; day++ )
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
			int employeeWage = workingHrs*myObj.wagePerHrs;
			totalwage = totalwage+employeeWage;
			totalWorkingHours = totalWorkingHours + workingHrs;
			System.out.println("Employee Daily wages is as per working hour " + employeeWage + " total working hours "+ totalWorkingHours);
			}
			System.out.println("Wage for a month "+ totalwage);
				
		}
	
	public static void main(String[] args) {
		employeewage.getEmployeeWageFunction();
		
	}
}