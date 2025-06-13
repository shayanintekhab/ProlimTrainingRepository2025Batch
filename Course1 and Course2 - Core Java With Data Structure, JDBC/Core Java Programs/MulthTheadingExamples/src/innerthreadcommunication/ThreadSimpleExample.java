package innerthreadcommunication;
class Task implements Runnable {
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			
			try {
			Thread.sleep(500);
			
			System.out.println(name +" "+i);
			
			if(name.equals("Raj") && i==4) {
				wait();
			}
			if(name.equals("Ramesh") && i==8) {
				wait();
			}
			if(name.equals("Ravi") && i==6) {
				//notify();
				notifyAll();
				wait();
			}
			}catch(Exception e) {}
		}
	}
}
public class ThreadSimpleExample {

	public static void main(String[] args) {
		Task tt = new Task();
		new Thread(tt,"Raj").start();
		new Thread(tt,"Ravi").start();
		new Thread(tt,"Ramesh").start();

	}

}
