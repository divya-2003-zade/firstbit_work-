package p1;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MovieDetails booking = new MovieDetails();
		
		while(MovieDetails.remainingTickets > 0) {
			System.out.println("\nRemaining tickets :" +MovieDetails.remainingTickets);
			System.out.println("Enter number of tickets :");
			
			int numberOfTickets= sc.nextInt();
			
		try	{
				booking.bookTickects(numberOfTickets);
			}catch(InvalidTicketNumberException e) {
				System.out.println(e.getMessage());
			}catch(TicketsSoldOutException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nSorry !! Tickets are sold out.");
		sc.close();
	}

}
