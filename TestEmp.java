import java.util.Scanner;


public class TestEmp 
{
	public static void main(String[] args) 
	{
		
		
		//Emp e1=new Emp(101,50,"servo");
		//e1.showInfo();
		//create an array of Emp type
		Scanner s=new Scanner(System.in);
		/*System.out.println("how many employees are there : ");
		int num_of_emp=s.nextInt();
		Emp earr[]=new Emp[num_of_emp];
		
		//
		for (int i = 0; i < earr.length; i++) 
		{
			earr[i]=new Emp();
			System.out.println("Enter the id : ");
			//int id=s.nextInt();
			earr[i].setId(s.nextInt());
			System.out.println("Enter the Name : ");
			//String nm=s.next();
			earr[i].setName(s.next());
		}
		for (int i = 0; i < earr.length; i++) 
		{
			earr[i].showInfo();
		}*/
		
		Emp e1=new Emp(1,5000,"Nikhil");
		Emp e2=new Emp(1,5000,"Nikhil");
		
		//shallow copying
		if (e1.equals(e2))
		{
			System.out.println("they are equal");
		}
		else
		{
			System.out.println("they are not equal");
		}
		
	}
}
