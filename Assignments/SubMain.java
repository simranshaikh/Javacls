package Assignments;

public class SubMain 
{
	public static void main(String[] args) 
	{
		SubTest s=new SubTest();
		System.out.println(s.subtraction(35, 25));
		System.out.println(s.subtraction(35, 25, 10));
		System.out.println(s.subtraction(35.5, 25.3));
		System.out.println(s.subtraction(35, 25.35));
		System.out.println(s.subtraction(35.2f, 25.2f, 7.2f));
	}
}
