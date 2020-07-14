public class SeaFactory implements AnimalFactory 
{
	public Animal getAnimalInstance()
	{
		return new Fish();
	}
}

