package employeecomoutation;

public class employeewage {
public static void main(String[] args) {
	
	int PartTime=1;
	int FullTime=2;
	double employeeCheck=(int) (Math.random() * 10)%3;
	int wagePerHrs=20;
	int workingHrs=0;
	
		
	if(employeeCheck==FullTime) {
		System.out.println("Employee is present as 'FULLTIME' ");
		workingHrs=8;
	}
	else if(employeeCheck==PartTime){
		System.out.println("Employee is present as 'PARTTIME' ");
		workingHrs=4;
	}
	else {
		System.out.println("Employee is absent");
	}
	int employeeWage = workingHrs*wagePerHrs;
	System.out.println("Employee Daily wages is as per working hour " + employeeWage);
}
}