/*
for a single try block there can be multiple catch blocks
*/
import java.util.*;
class ExDemo2
{
	public static void main(String[] args)
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		try
		{
			x=sc.nextInt();
			y=sc.nextInt();
			z=x/y;
			System.out.println("Result="+z);
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Enter numbers only");
		}
		catch(ArithmeticException ex2)
		{
			System.out.println("The second no. can't be zero");
		}
		finally
		{
			System.out.println("Bye......Bye......");
		}
	}
}