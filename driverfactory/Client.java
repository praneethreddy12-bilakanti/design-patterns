class Client 
{
	public static void main(String[] args) 
	{
ConnectionDemo con=DriverManagerDemo.getConnection(args[0]);

con.createStatement();

}
}
