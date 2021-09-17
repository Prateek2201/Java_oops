class Car
{
	public String make;	//Instance Variable
	public String color;	//Instance Variable
	public long price;	//Instance Variable
}
class ClassDemo2
{
	public static void main(String [] args)
	{
		Car c=new Car();	//Creation of object
		c.make="Mahindra";
		c.color="Grey";
		c.price=850000;
		System.out.println("Car make= "+c.make);
		System.out.println("Car color= "+c.color);
		System.out.println("Car price= "+c.price);
	}
}