public class PersonFactory 
{
	public static Person getPerson(String type)
	{
		if(type.equals("male"))
		{
			return new Male();
		}
		else if(type.equals("female"))
		{
			return new FeMale();
		}
		else
			return null;
	}
}
