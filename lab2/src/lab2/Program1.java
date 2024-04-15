package lab2;

class Person{
    
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

public class Program1 {
	
	public static void main(String [] args)
	{
		Person p1 = new Person("ABC",20);
		Person p2 = new Person("XYZ",19);
		p1.display();
		p2.display();
	}

}
