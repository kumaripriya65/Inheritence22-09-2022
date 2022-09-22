package inheritenceExercise;

public class SalaryEmploye extends Employe{
	

	
		public double weeklySalary;
		
	

		
		public SalaryEmploye() {
			super();
		}
		

		public SalaryEmploye(double weeklySalary,String empName, String jobTitle) {
			super(empName,jobTitle);
			this.weeklySalary = weeklySalary;
			
		}
		


		public double getWeeklySalary() {
			return weeklySalary;
		}

		public void setWeeklySalary(double weeklySalary) {
			this.weeklySalary = weeklySalary;
		}
		
		@Override
		public double calculatePay(double payrat) {
			return weeklySalary*payrat;
		}
	}
		
		

	

