class Test 
{

int x;
String name;
Test(int x,String name)
	{

	this.x=x;
	this.name=name;
	}
	
	/*public Object clone()
	{

try
{
	return super.clone();
}
catch (Exception e)
{
e.printStackTrace();
}
	
	return null;
	}
	*/
void display()
	{

System.out.println("x:"+x+"\t"+"name:"+name);
	}

	public static void main(String[] args)throws Exception 
	{
Test t=new Test(10,"praneeth");
System.out.println(t);
t.display();

		Test t1 =(Test)t.clone();
		System.out.println(t1);
		t1.display();
		t1.x=20;
t1.name="sehwag";

		System.out.println(t);
		t.display();
		t1.display();



}
}
