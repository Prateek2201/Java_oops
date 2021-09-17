class SayHello
{
	public void wish()
	{
		System.out.println("Hello, Friends ! Good Morning");
	}
}
class ClassDemo1
{
	public static void main(String [] args)
	{
		SayHello sh=new SayHello();	//Object Creation
		sh.wish(); 	
	}
}