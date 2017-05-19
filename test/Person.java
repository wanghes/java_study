class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名："+this.name+";年龄："+this.age;
	}

	public static void main(String[] args){
		Person p = new Person("test",10);
		System.out.println("对象信息："+p);
	}
}
