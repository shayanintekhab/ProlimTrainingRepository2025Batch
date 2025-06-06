package arraythread;
class Task extends Thread {
	@Override
	public void run() {
	String name = Thread.currentThread().getName();
	System.out.println(name);
	}
}
public class ArrayThreadExample {

	public static void main(String[] args) {
	Task threadArray[]=new Task[10];
	for(int i=0;i<threadArray.length;i++) {
		threadArray[i]=new Task();
		threadArray[i].start();
	}
	}

}
