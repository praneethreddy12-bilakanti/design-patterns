import java.io.*;
class Test 
{
	public static void main(String[] args)throws IOException
	{
	   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Name: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Address: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        Prototypeimpl e1=new Prototypeimpl(eid,ename,edesignation,esalary,eaddress);  
          System.out.println(e1);
        e1.showRecord();  
        System.out.println("\n");  
        Prototypeimpl e2=(Prototypeimpl) e1.getClone();  
		          System.out.println(e2);

        e2.showRecord(); 
		          System.out.println(e1==(e2));

    }     
}//End of the ProtoypeDemo class. 