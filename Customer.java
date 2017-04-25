
public class Customer 
{
	private String custid;
	private String custname;
	private int custMoblie;
	private static int count;
	
	static
	{
		count=10;
	}
	public Customer() 
	{
		count++;
		System.out.println("in default constuctor......");
	}
	
	public Customer(String custid, String custname, int custMoblie)
	{
		count++;
		System.out.println("in para cust constuctor......");
		this.custid = custid;
		this.custname = custname;
		this.custMoblie = custMoblie;
	}
	//static methods cannot access non static data members
	public static void showCount()
	{
		System.out.println("Number of objects created : "+count);
	}
	//non static methods can access static data members 
	public void showCustDetails() 
	{
		System.out.println("Number of objects created : "+count);
		System.out.println("this.custid");
		System.out.println("this.custname");
		System.out.println("this.custMoblie");
	}
}
