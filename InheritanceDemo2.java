import java.util.*;
class Shape
{
	protected int s;	//protected variable
	public void setValue(int x)
	{
		s=x;	
	}
}
class Square extends Shape
{
	public int area()
	{
		return (s*s);
	}
}
class Cube extends Shape
{
	public int volume()
	{
		return (s*s*s);
	}
}
class InheritanceDemo2
{
	public static void main(String[] args)
	{
		int x,a,v;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side of Square: ");
		x=sc.nextInt();
		Square sq=new Square();
		sq.setValue(x);
		a=sq.area();
		System.out.println("Area of Square= "+a);
		System.out.println();
		System.out.print("Enter side of Cube: ");		
		x= sc.nextInt();
		Cube cu=new Cube();
		cu.setValue(x);
		v=cu.volume();
		System.out.println("Volume of Cube= "+v);
	}
}