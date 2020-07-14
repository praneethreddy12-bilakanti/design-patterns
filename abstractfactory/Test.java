public class Test 
{
	public static void main(String[] args) 
	{
		AnimalFactory af=AnimalAbstractFactory.getAnimalInstance(args[0]);
		Animal a=af.getAnimalInstance();
		a.breathe();
		System.out.println("Hello World!");
	}
}
