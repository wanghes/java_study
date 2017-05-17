class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("父类Person中构造函数");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age; 
	}
	public void setAge(int age){
		this.age = age;
	}
}
class Student extends Person{
	private String school;
	public Student(){
		super();
		System.out.println("子类Student中的构造函数");
	}
}
public class DemoTest01{
	public static void main(String[] args){
		Person wang = new Person();
		wang.setAge(11);
		System.out.println(wang.getAge());
		Student hai = new Student();
	}
}