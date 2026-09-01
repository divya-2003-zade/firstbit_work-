class LibraryUser{
	String userName; 
	int daysLate;
	static double finePerDay ;
	{
		finePerDay = 5.0;
	}
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	int getDaysLate() {
		return daysLate;
	}
	void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}
	static double getFinePerDay() {
		return finePerDay;
	}
	static void setFinePerDay(double finePerDay) {
		LibraryUser.finePerDay = finePerDay;
	}
	LibraryUser() {
		this.userName = "abc";
		this.daysLate = 1;
	}
	LibraryUser(String userName, int daysLate) {
		this.userName = userName;
		this.daysLate = daysLate;
	}
	// Method to calculate total fine 
	double calculateFine() { 
		return daysLate * finePerDay; 
		}
	// Display user details and fine
	void display() {
		System.out.println("User Name: " + userName);
		System.out.println("Days Late: " + daysLate); 
		System.out.println("Fine Per Day: " + finePerDay); 
		System.out.println("Total Fine: " + calculateFine()); 
		System.out.println(); 
		}
}
class FineCalculation {

	public static void main(String[] args) {
		
		LibraryUser u1 = new LibraryUser("Pratiksha", 4); 
		LibraryUser u2 = new LibraryUser("Rahul", 7);
		
		// Display fine details 
		u1.display(); 
		u2.display();
	}

}
