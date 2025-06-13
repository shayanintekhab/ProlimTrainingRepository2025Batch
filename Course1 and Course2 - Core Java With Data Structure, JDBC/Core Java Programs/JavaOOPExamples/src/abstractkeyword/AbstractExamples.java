package abstractkeyword;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("Generic mailage 65km/lt");
	}
}
class Pulsar extends Bike {
	@Override
	void mailage() {
		System.out.println("Pulsar mailage 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("speed override 90km/hr");
	}
	void speed(int x) {
		System.out.println("speed override 90km/hr");
	}
}
class Honda extends Bike {
	@Override
	void speed() {
		System.out.println("speed override 50km/hr");
	}
}
public class AbstractExamples {
	public static void main(String[] args) {
		Pulsar pu  = new Pulsar();
		pu.mailage();
		pu.speed();
		Honda hh  = new Honda();
		hh.mailage();
		hh.speed();
		//Bike bb = new Bike();		// error 
		Bike bb = new Pulsar();		// abstract class reference creating. 
		
	}
}
