package booking;
class TicketBooking {
	private int availableTicket = 3;
	synchronized void bookTicket(String customerName,int numberOfTicket) {
		if(availableTicket>=numberOfTicket) {
			System.out.println(customerName+" book the "+numberOfTicket+" tickets, successfully");
			availableTicket = availableTicket-numberOfTicket;
			System.out.println("avilable ticket is "+availableTicket);
		}else {
			System.out.println(customerName+ " sorry no ticket available");
		}
	}
}
class BookingThread extends Thread {
	private String customerName;
	private int numberOfTicket;
	private TicketBooking ticketBooking;
	public BookingThread(TicketBooking ticketBooking, String customerName, int numberOfTicket) {
		this.ticketBooking = ticketBooking;
		this.customerName = customerName;
		this.numberOfTicket = numberOfTicket;
	}
	@Override
	public void run() {
		ticketBooking.bookTicket(customerName,numberOfTicket);
	}
}
public class BookingApp {
	public static void main(String[] args) {
	TicketBooking tbooking1 = new TicketBooking();	// heap memory created 3 ticket available 	
	//TicketBooking tbooking2 = new TicketBooking();	// heap memory created 3 ticket available 	
	BookingThread t1 = new BookingThread(tbooking1,"John",2);		// client 1 
	BookingThread t2 = new BookingThread(tbooking1,"Raju",3);		// client 2 
	t1.start();
	t2.start();
	}

}
