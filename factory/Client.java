public class Client 
{
	public static void main(String[] args) 
	{
		Person P=PersonFactory.getPerson(args[0]);
		P.wish("xyz");
		System.out.println("Hello World!");
	}
}
