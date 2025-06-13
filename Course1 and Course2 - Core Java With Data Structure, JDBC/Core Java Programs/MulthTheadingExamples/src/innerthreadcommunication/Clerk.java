package innerthreadcommunication;

public class Clerk extends Thread{
	TicketWindow tw;
	int numberOfTickets[] = {4,5,2,8}; 
	public Clerk(TicketWindow tw) {
		this.tw=tw;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				tw.issueTicket(numberOfTickets[i]);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
