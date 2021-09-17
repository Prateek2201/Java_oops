class ExDemo1
{
	public static void main(String[] args)
	{
		System.out.println("Anurag in 1st class");
		System.out.println("Anurag in 2nd class");
		System.out.println("Anurag in 10th class");
		System.out.println("Anurag in 12th class");
		System.out.println("Anurag in diploma cs");
		System.out.println("Anurag become Software Engineer");		
		try
		{
			System.out.println("Anurag weds Anushka"+(10/0));
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Anurag weds Katrina");
		}
		System.out.println("Anurag's Kids");
	}
}