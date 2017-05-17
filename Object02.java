class A{
	public void func1(){

	}
	public void func2(){

	}
}
class B extends A{
	public void func1(){

	}
	public void func3(){

	}
}
public class Object02{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		System.out.println("a 继承自 A: "+ (a instanceof A));
		System.out.println("a 继承自 B: "+ (a instanceof B));
		System.out.println("b 继承自 A: "+ (b instanceof A));
		System.out.println("b 继承自 B: "+ (b instanceof B));
	}
}