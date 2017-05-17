abstract class A{
	public abstract void print();
}

class B extends A{
	public void print(){
		System.out.println("test abstract");
	}
}

interface Aa{
	public abstract void print();
}
class Bb implements Aa{
	public void print(){
		System.out.println("test interface");
	}
}

public class Abstract01{
	public static void main(String[] args){
		A a = new B();
		a.print();

		Aa aa = new Bb();
		aa.print();
	}
}

