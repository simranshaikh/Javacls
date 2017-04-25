package ExceptionHandling;
import java.util.Scanner;
public class Cinic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Doctor d=new Doctor();
		System.out.println("enter doctors degree : ");
		String deg=sc.next();
		try 
		{
			d.setDegree(deg);
		} 
		catch (DoctorException e)
		{
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		System.out.println("enter doctors name : ");
		String nm=sc.next();
		d.setName(nm);
		System.out.println(d);
	}
}
