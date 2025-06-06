package gamepackage;
class Bike implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("In run method "+t.getName());
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+" is moving with speed as "+(i+50));
			try {
			Thread.sleep(300);
			}catch(Exception e) {}
		}
	}
}
class Car implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("In run method "+t.getName());
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+" is moving with speed as "+(i+50));
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class GameExample {
	public static void main(String[] args) throws Exception{
	Bike bb1 = new Bike();			// new memory 
	Car cc1 = new Car();				// new memory 
	Car cc2 = new Car();				// new memory 
	Thread t1 = new Thread(bb1);
	Thread t2 = new Thread(cc1);
	Thread t3 = new Thread(cc1);
	Thread t = Thread.currentThread();
	System.out.println("In main thread = "+t.getName());
	t1.setName("1st Bike");
	t2.setName("1st Car");
	t3.setName("2nd Car");
//	System.out.println("1st thread "+t1.isAlive());
//	System.out.println("2nd thread "+t2.isAlive());
//	System.out.println("3rd thread "+t3.isAlive());
	System.out.println("Game Start");
	Thread.sleep(1000);
	System.out.println("1....");
	Thread.sleep(1000);
	System.out.println("2....");
	Thread.sleep(1000);
	System.out.println("3....");

	t1.start();
	t2.start();
	t3.start();
	
//	System.out.println("1st thread "+t1.isAlive());
//	System.out.println("2nd thread "+t2.isAlive());
//	System.out.println("3rd thread "+t3.isAlive());
	t2.join();     // join method is use to join from child to parent thread. So parent thread wait for child thread to get destroy 
	System.out.println("Game End....");
	}

}
