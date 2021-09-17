interface interface2
{
	void registration();	//public abstract void registration();
	void counceling();	//public abstract void counceling();
	void feesubmission();	//public abstract void feesubmission();
}
abstract class Test1 implements interface2
{
	public void registration()
	{
		System.out.println("Business logic of registration");
	}
}
abstract class Test2 extends Test1
{
	public void counceling()
	{
		System.out.println("Business logic of counceling");
	}
}
class Test3 extends Test2
{
	public void feesubmission()
	{
		System.out.println("Business logic of feesubmission");
	}
}
class InterfaceDemo2 
{
	public static void main(String[] args)
	{
		Test3 t=new Test3();
		t.registration();
		t.counceling();
		t.feesubmission();	
	}
}