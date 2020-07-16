package super_keyword;

public class Super_With_Parameterize_Constructor 
{

	public static void main(String[] args)
	{
		
		Beta obj=new Beta();

	}

}
class Baap              // Super class
{
	Baap(int x)         // Parameterize constructor
	{
		int a=x;
		System.out.println("Super class A= "+a);
	}
}
class Beta extends Baap  // sub class
{
	Beta()              // Default constructor
	{
		super(100);
		int b=200;
		System.out.println("Sub class B= "+b);
	}
}
