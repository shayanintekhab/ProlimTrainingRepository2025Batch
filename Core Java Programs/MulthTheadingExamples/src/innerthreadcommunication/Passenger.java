package innerthreadcommunication;

public class Passenger extends Thread{
TicketWindow tw;
public Passenger(TicketWindow tw) {
	this.tw=tw;
}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				tw.collectTicket();
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
