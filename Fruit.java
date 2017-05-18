interface Fruits{
	public void eat();
}

class Apple implements Fruits{
	public void eat(){
		System.out.println("**吃苹果。");
	}
}

class Orange implements Fruits{
	public void eat(){
		System.out.println("**吃橘子。");
	}
} 

//工厂模式
class Factory{
	public static Fruits getInstance(String className){
		Fruits f = null;
		if("apple".equals(className)){
			f = new Apple();
		}
		if("orange".equals(className)){
			f = new Orange();
		}
		return f;
	}
}

public class Fruit{
	public static void main(String[] args){
		Fruits f = null;
		f = Factory.getInstance("apple");
		f.eat();

		String testString = null;
		//System.out.println(testString.equals("test"));
		System.out.println("test".equals(testString));
	}
}