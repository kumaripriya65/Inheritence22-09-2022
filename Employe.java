package inheritenceExercise;

public abstract class Employe {
	public String empName;
	public String jobTitle;
	
	public Employe() {
		
	}
	public Employe(String empName, String jobTitle) {
		this.empName = empName;
		this.jobTitle = jobTitle;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public abstract double calculatePay(double payrat);
	
	@Override
	public String toString() {
		return "Employe [empName=" + empName + ", jobTitle=" + jobTitle + "]";
	}


	
	
}


