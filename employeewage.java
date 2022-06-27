package employeecomoutation;

public class employeewage {
public static void main(String[] args) {
	
	final int PartTime=1;
    final int FullTime=2;
	final int wagePerHrs=20;
	final int maxWorkingDays=20;
	final int maxWorkingHrs=100;
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
		System.out.println("Wage for a month "+ totalwage);
}

}