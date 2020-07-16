package super_keyword;

public class Super_With_Default_Constructor 
{

	public static void main(String[] args) 
	{
		Beti obj=new Beti();

	}
    
}
class Maa            // super class
{
	Maa()           //  default constructor
	{
		int a=100;
		System.out.println("Super class A= "+a);
	}
}
class Beti extends Maa    //  sub class
{
	Beti()               //  default constructor
	{
		super();
		int b=200;
		System.out.println("Sub class B= "+b);
	}
}
