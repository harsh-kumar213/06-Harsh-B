package lab2;

class Dog{
	private String name;
	private String breed;
	
	public Dog(String name)
	{
		this.name = name;
	}
	
	public Dog(String name,String breed)
	{
		this(name);
		this.breed=breed;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(breed);
	}
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d1 = new Dog("Tommy","Golden Retriever");
        Dog d2 = new Dog("Jerry","German Shephard");
        
        
        d1.display();
        d2.display();
        
        d1.setName("Chloe");
        d2.setBreed("Fighter");
        
        d1.display();
        d2.display();
	}

}
