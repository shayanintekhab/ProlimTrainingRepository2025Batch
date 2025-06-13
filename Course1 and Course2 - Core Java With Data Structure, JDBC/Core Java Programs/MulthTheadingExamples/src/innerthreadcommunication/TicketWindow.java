package innerthreadcommunication;

public class TicketWindow {
private int ticket =0;
private boolean availabe = false;

public synchronized void issueTicket(int number) throws Exception{
	//System.out.println("Ticket issue "+number);
	while(availabe) {
		wait();
	}
	ticket = number;
	System.out.println("Clerk issue the ticket "+ticket);
	availabe=true;
	notify();
}
public synchronized void collectTicket() throws Exception{
	//System.out.println("Collect the ticket");
	while(!availabe) {
		wait();
	}
	System.out.println("Passange collect the ticket "+ticket);
	availabe=false;
	notify();
	
}
}
