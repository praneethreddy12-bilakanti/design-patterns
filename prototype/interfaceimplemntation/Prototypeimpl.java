import java.io.*;
class Prototypeimpl implements Prototype
{
	 private int id;  
   private String name, designation;  
   private double salary;  
   private String address;  
      Prototypeimpl()
	{
 System.out.println("   Employee Records of Oracle Corporation ");  
            System.out.println("---------------------------------------------");  
            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
      
	}
public  Prototypeimpl(int id, String name, String designation, double salary, String address) {  
          
        this();  
        this.id = id;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  
    }  
      
  public void showRecord(){  
          
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
   }  
  
    @Override  
    public Prototype getClone() {  
          
        return new Prototypeimpl(id,name,designation,salary,address);  
    }  
}//End of EmployeeRecord class