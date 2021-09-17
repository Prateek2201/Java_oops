import java.util.*;
class Shapes
{
	public int area(int s)			//Area of square
	{
		return (s*s);
	}
	public int area(int l,int b)		//Area of rectangle
	{
		return (l*b);
	}
	public double area(float r)		//Area of circle
	{
		return (3.14*r*r);
	}
}
class FunOverloading
{
	public static void main(String[] args)
	{
		int s,l,b,a1,a2;
		float r;
		double a3;
		Scanner sc=new Scanner(System.in);
		Shapes sh=new Shapes();
		System.out.print("Enter side of square: ");
		s=sc.nextInt();
		a1=sh.area(s);
		System.out.println("Area of square= "+a1+"\n");
		System.out.print("Enter length and breadth of rectangle: ");
		l=sc.nextInt();
		b=sc.nextInt();
		a2=sh.area(l,b);
		System.out.println("Area of rectangle= "+a2+"\n");
		System.out.print("Enter radius of circle: ");
		r=sc.nextFloat();
		a3=sh.area(r);
		System.out.println("Area of circle= "+a3);
	}
}