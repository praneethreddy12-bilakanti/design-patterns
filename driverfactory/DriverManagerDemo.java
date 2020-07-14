class DriverManagerDemo 
{
public static  ConnectionDemo getConnection(String type)
	{

ConnectionDemo con=null;
if(type.equals("o"))
		{
		con=new Oracle();
		return con;

		}
		else if(type.equals("m"))
		{

con=new MySQL();
return con;

		}
		else
		{
			return null;
		}



}
}
