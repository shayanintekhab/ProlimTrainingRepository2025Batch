package polymorphsim;

class Bike {
	void speed() {
		System.out.println("speed 60km/hr");
	}
}
class Pulsar extends Bike {
	
	void mailage() {
		System.out.println("Pulsar mailage 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("speed override 90km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Pulsar mailage 65km/lt");
	}
}
public class MethodOverridingExamples {
	public static void main(String[] args) {
//	Honda hh = new Honda();
//	hh.speed();  
//	hh.mailage();
//	Pulsar pu = new Pulsar();
//	pu.speed(); 
//	pu.mailage();
	
	Bike bb1 = new Bike();		// super class object creation 
	bb1.speed();
	
	Pulsar pu1 = new Pulsar();	// creating sub class object 
	pu1.speed();					// method overriding 
	pu1.mailage();				// its own method 
	
	//Pulsar pu2 = new Bike();	// creating super class object and assigning to sub class object reference not possible 
	Bike bb2 = new Pulsar();	// creating sub class object and assigning to super class reference possible 
	//System.out.println(bb2);
	bb2.speed();		// we can call only super class or override methods 
	//bb2.mailage();
	Pulsar p3 =(Pulsar)bb2;		// explicit type casting on object level.
	p3.speed();					// method overriding 
	p3.mailage();	
	//System.out.println(p3);
	}

}






