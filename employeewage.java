package employeecomoutation;

public class employeewage {
public static void main(String[] args) {
	
	final int PartTime=1;
	final int FullTime=2;
		int employeeCheck=(int) (Math.random() * 10)%3;
	final int wagePerHrs=20;
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
	}
	}