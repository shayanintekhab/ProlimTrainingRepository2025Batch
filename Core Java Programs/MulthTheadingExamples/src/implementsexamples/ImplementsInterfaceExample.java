package implementsexamples;

class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}	
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsInterfaceExample {
	public static void main(String[] args) {
	Runnable obj1 = new A();
	Runnable obj2 = new B();
	Thread t1  = new Thread(obj1);		// Thread class reference 
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();
	}

}
