package employeecomoutation;

public class employeewage {
public static void main(String[] args) {
	
	int Employee_present=1;
	int wagePerHrs=20;
	int workingHrs=8;
	double employeeCheck=(int) (Math.random() * 10)%2;
	
	if(employeeCheck==Employee_present) {
		System.out.println("Employee is 'PRESENT' ");
		int employeeWage=wagePerHrs*workingHrs;
		System.out.println("employee wage per working hours " + employeeWage);
	}
	else {
		System.out.println("Employee is absent");
		System.out.println("employee wage per working hours " + 0 + " beacuse employee is absent");

	}

}

}