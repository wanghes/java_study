class A{
	public void fun1(){
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
}
class B extends A{
	public void fun1(){
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}");
	}
}

class C extends A{
	public void fun1(){
		System.out.println("C --> public void fun1(){}");
	}
	public void fun4(){
		System.out.println("C --> public void fun4(){}");
	}
}

public class Object01{
	public static void main(String[] args){
		fun(new B());
		fun(new C());
		funDuo(new B());
		funDuo(new C());
	}
	public static void fun(B b){
		b.fun1();
	}

	public static void fun(C c){
		c.fun1();
	}

	//通过多太化
	public static void funDuo(A a){
		a.fun1();
		if(a instanceof B){
			B b = (B) a;
			b.fun3();
		}
		if(a instanceof C){
			C c = (C) a;
			c.fun4();
		}
	}
}
