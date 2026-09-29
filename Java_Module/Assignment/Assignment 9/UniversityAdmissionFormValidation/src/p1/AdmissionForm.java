package p1;

public class AdmissionForm {


	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	public AdmissionForm(String studentname, int age, double percentage, double courseFees, double feesPaid) {
		super();
		this.studentName = studentname;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	public void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,
	NotFitForAdmissionException,FeesNotPaidException,InsufficientFeesException{
		//1. Name Validation
		if(studentName == null || studentName.trim().isEmpty()) {
			throw new EmptyNameException("Student name cannot be empty!!");
		}
		
		//2. Age Validation
		if(age <  17) {
			throw new UnderageException("Student must be at least 17 years old!!");
		}
		
		//3.Percentage range validation
		if(percentage < 0 || percentage > 100) {
			throw new InvalidPercentageException("Percentage must be between 0 and 100");
		}
		
		//4.Admission Eligibility
		if(percentage < 35) {
			throw new NotFitForAdmissionException("Student is not eligible for admission!!");
		}
		
		//5.Fees paid VAlidation
		if(feesPaid == 0) {
			throw new FeesNotPaidException("Student does not paid the fees");
		}
		
		//6.minimum 30% fees validation
		if(feesPaid < 0.30 * courseFees) {
			throw new InsufficientFeesException("Student must Paid the minimum 30% of course fees");
		}
	}
}



