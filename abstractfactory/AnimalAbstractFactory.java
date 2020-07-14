public class AnimalAbstractFactory
{

public static AnimalFactory getAnimalInstance(String type)
	{
	if(type.equals("water"))
		
		return new SeaFactory();
		
		else 
			return new LandFactory();
	}


}