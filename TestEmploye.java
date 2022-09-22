package inheritenceExercise;

public class TestEmploye {

public static void main(String[] args) {
		
		Employe emp1= null;
		emp1= new SalaryEmploye(1000,"Priya","JAVA Developer"); 
		
		System.out.println(emp1);
		System.out.println("Weekly Salary : "+emp1.calculatePay(3500000));
		
		System.out.println("*****************************************");
		
		emp1 = new HourlyEmploye(1100,"DARSHAVI","Python  Developer");
		System.out.println(emp1);
		System.out.println("Hourly Salary : "+emp1.calculatePay(25000000));
	}




	
}
		
		




