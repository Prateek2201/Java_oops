interface interface1
{
	void m1();	//public abstract void m1();
	void m2();	//public abstract void m2();
	void m3();	//public abstract void m3();
}
class TestInterface implements interface1
{
	public void m1()
	{
		System.out.println("Business logic of m1");
	}
	public void m2()
	{
		System.out.println("Business logic of m2");
	}
	public void m3()
	{
		System.out.println("Business logic of m3");
	}
}
class InterfaceDemo1
{
	public static void main(String[] args)
	{
		TestInterface ti=new TestInterface();
		ti.m1();
		ti.m2();
		ti.m3();
	}
}