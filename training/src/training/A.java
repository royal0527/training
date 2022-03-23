package training;

interface C
{
	void foo();

}


public class A implements C{
	
	A()
	{
		
	}
	
	public void foo()
	{
		
	}
}
	


class B implements C
{
	

	public void foo()
	{
		System.out.println("b");
	}
}