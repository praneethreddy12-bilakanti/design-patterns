class Test
{
private static Test t=new Test();
private Test()
	{

	}


	public static Test getInstance()
	{


		return t;
	}

public void display()
	{

System.out.println(" business logic method");
	}

public String toString()
	{

	return"TEST";
	}
}
public class Early
{
	public static void main(String[] args) 
	{
Test t=Test.getInstance();
	System.out.println(t);
	System.out.println(t.hashCode());
	t.display();
	Test t1=Test.getInstance();
	System.out.println(t1);
	System.out.println(t1.hashCode());
	t1.display();


}
}
