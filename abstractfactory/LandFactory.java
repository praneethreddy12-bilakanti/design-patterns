public class LandFactory implements AnimalFactory 
{
	public Animal getAnimalInstance()
	{
		return new Elephant();
	}
}

