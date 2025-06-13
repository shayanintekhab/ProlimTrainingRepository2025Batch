package interfaceexamples;

public class EmailNotifier implements Notifier{
private String smtpServer;
private String fromAddress;
	
	
	public EmailNotifier(String smtpServer, String fromAddress) {
	super();
	this.smtpServer = smtpServer;
	this.fromAddress = fromAddress;
	}
	


	public EmailNotifier() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void sendNotification(String recipient, String message) {
			// logic to display the message using smptServlet, fromAddress, recipient, message 
		
	}

}
