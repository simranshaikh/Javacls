import java.util.Date;
public class TestInheritance 
{
	public static void main(String[] args)
	{
		Date d=new Date((2017-1900),04,14);
		Associate a=new Associate(10, "Shubham", d);
		//a.showData();
		System.out.println(a);
		
		//char ch='B';
		//System.out.println(ch);
		
		//int val=9;
		//System.out.println(val);
		
		//String nm="Raj";
		//System.out.println(nm);
		
		ELITian e=new ELITian(23, "Rohit", d, 2045, "TUS-14");
		System.out.println(e);
	}
}
