package inheritenceExercise;

public class HourlyEmploye extends Employe{
	 

		public double hoursWorked;

		public HourlyEmploye() {
			super();
		}

		public HourlyEmploye(double hoursWorked,String empName, String jobTitle) {
			super(empName, jobTitle);
			this.hoursWorked=hoursWorked;
		}
		
		@Override
		public double calculatePay(double payrat) {
			return hoursWorked*payrat;
		

		
	}
	


}
