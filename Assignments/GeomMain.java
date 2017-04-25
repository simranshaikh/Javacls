package Assignments;

import java.util.Scanner;

public class GeomMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Circle1 c=new Circle1();
		System.out.println("enter the radius");
		double rad=sc.nextDouble();
		System.out.println(c.calArea(rad));
		System.out.println( c.calCircumference(rad));
		
	}
}
