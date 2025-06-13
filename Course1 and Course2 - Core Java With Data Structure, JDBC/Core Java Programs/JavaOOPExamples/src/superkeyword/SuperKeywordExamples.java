package superkeyword;
abstract class A {
	int a;
	A() {
		System.out.println("A class constructor");
	}
}
class B extends A {
	B() {
		//super();
		System.out.println("B class constructor");
	}
}
public class SuperKeywordExamples {

	public static void main(String[] args) {
		B obj1 = new B();
	}

}
