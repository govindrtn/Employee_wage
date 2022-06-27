package employeecomoutation;

public class employeewage {
public static void main(String[] args) {
	
	final int PartTime=1;
    final int FullTime=2;
	final int wagePerHrs=20;
	final int workingDays=20;		
		int totalwage =0;
		for(int day=1; day<=workingDays;day++)
		{
			int employeeCheck=(int) (Math.random() * 10)%3;
			int workingHrs=0;
				
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
		System.out.println("Employee Daily wages is as per working hour " + employeeWage);
		totalwage = totalwage+employeeWage;
		}
		System.out.println("Wage for a month "+ totalwage);
}

}