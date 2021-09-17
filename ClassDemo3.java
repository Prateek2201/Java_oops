class NewCar
{
	private String make;
	private String color;
	private long price;
	public void setCar(String m,String c,long p)
	{
		make=m;
		color=c;
		price=p;
	}
	public void display()
	{
		System.out.println("Car make= "+make);
		System.out.println("Car color= "+color);
		System.out.println("Car price= "+price);
	}
}
class ClassDemo3
{
	public static void main(String [] args)
	{
		NewCar nc=new NewCar();
		nc.setCar("Tata","Silver",1000000);
		nc.display();
	}
}