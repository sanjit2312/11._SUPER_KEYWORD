package super_keyword;

public class Super_With_Method
{

	public static void main(String[] args) 
	{
		
		Sister obj=new Sister();
		obj.disp();

	}

}
class Mother            // Super class
{
	int a=100;          // instance variable
	void put()          // super class method
	{
		System.out.println("Super class A= "+a);
	}
}
class Sister extends Mother            // sub class
{
	int b=200;             // instance variable
	void put()
	{
		System.out.println("Sub class B= "+b);
	}
	void disp()
	{
		super.put();
		put();
	}
}
