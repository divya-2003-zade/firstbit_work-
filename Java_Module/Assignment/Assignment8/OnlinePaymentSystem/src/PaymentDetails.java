abstract class Payment{
	int paymentId;
	double amount;
	String payerName;
	String status;
	//Default Constructor
	Payment() {
		this.paymentId = 0;
		this.amount = 0.0;
		this.payerName = "NA";
		this.status = "NA";
	}
	//Parameterized Constructor
	Payment(int paymentId, double amount, String payerName) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = "PENDING";
	}
	int getPaymentId() {
		return paymentId;
	}
	void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	double getAmount() {
		return amount;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	String getPayerName() {
		return payerName;
	}
	void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	//Print the Payment Details 
	void printSummary() {
		System.out.println("\n--------Payment Details-------");
		System.out.println("Payment ID : "+this.paymentId);
		System.out.println("Amount : "+this.amount);
		System.out.println("Payer Name : "+this.payerName);
		System.out.println("Status : "+this.status);
	}
	final void process() {
		System.out.println("\nProcessing Payment ID : "+this.paymentId);
		if (validate()) {
            deductAmount();
            sendNotification();
            status = "SUCCESS";
            System.out.println("Payment processed successfully.");
        } else {
        	status = "FAILED";
            System.out.println("Payment validation failed.");
        }
   }
	abstract boolean validate();

    abstract void deductAmount();

    abstract void sendNotification();
}
class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	CardPayment() {
		super();
		this.cardNumber = "NA";
		this.cvv = "NA";
	}
	CardPayment(int paymentId, double amount, String payerName,String cardNumber, String cvv) {
		super(paymentId,amount,payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	String getCardNumber() {
		return cardNumber;
	}
	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	String getCvv() {
		return cvv;
	}
	void setCvv(String cvv) {
		this.cvv = cvv;
	}
	boolean validate() {
		
	    return cardNumber.matches("\\d{16}") && cvv.matches("\\d{3}");
	}
	void deductAmount() {
		System.out.println("Amount "+amount + "deducted from card ");
	}
	void sendNotification() {
		System.out.println("Card payment notification sent to "+this.payerName);
	}
	void printSummary() {
	    super.printSummary();

	    System.out.println("Card Number : " + this.cardNumber);
	    System.out.println("CVV : " + this.cvv);
	}
}
class UPIPayment extends Payment{
	String upiId;

	UPIPayment(int paymentId, double amount, String payerName,String upiId) {
		super(paymentId, amount, payerName);
		this.upiId = upiId;
	}
	boolean validate() {
		return upiId.contains("@")&& amount >=1 && amount<=10000;
	}
	void deductAmount() {
		System.out.println("Amount deduction through UPI");
	}
	void sendNotification() {
		System.out.println("UPI payment notification sent ");
	}
	void printSummary() {
	    super.printSummary();

	    System.out.println("UPI ID : " + this.upiId);
	}
}
class PaymentDetails {

	public static void main(String[] args) {
		Payment p1=new CardPayment(101,5000,"Divya","1234567890123456","123");
		p1.printSummary();
		p1.process();
		
		p1=new UPIPayment(102,2500,"Pratiksha","pratiksha@upi");
		p1.printSummary();
		p1.process();
	}

}
