package p1;

public class MovieDetails {
	String moviename="3 Idiots";
	static double tickectPrice =200;
	static int remainingTickets=50;
	
	public void bookTickects(int numberOfTickets)
	throws InvalidTicketNumberException,TicketsSoldOutException{
		//1. Validate ticket count
		if(numberOfTickets<=0) {
			throw new InvalidTicketNumberException("Number of tickect must be grater than 0!!");
		}
		
		//2.check availability
		if(remainingTickets== 0 || numberOfTickets > remainingTickets ) {
			throw new TicketsSoldOutException("Tickets are not avilable!!");
		}
		//3. Deduct only after successful validation
		remainingTickets = remainingTickets - numberOfTickets;
		
		double amount = numberOfTickets * tickectPrice;
		
		System.out.println("Booking Successful for \""+ moviename +"\"!");
		System.err.println("Tickets Booked : " +numberOfTickets);
		System.out.println("Total amount :" +amount);
	}
}
