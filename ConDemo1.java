class Cuboid
{
	int l,b,h;
	Cuboid(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	public int volume()
	{
		return (l*b*h);
	}
}
class ConDemo1
{
	public static void main(String [] args)
	{
		Cuboid c=new Cuboid(10,5,4);
		int v=c.volume();
		System.out.println("Volume of Cuboid= "+v);
	}
}