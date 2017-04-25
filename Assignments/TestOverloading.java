package Assignments;

import java.util.Scanner;

public class TestOverloading 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FunctionOverloading a=new FunctionOverloading();
		
		System.out.println("enter two integer numbers");
		System.out.println(a.addition(sc.nextInt(),sc.nextInt()));
		
		System.out.println("enter three integer numbers");
		System.out.println(a.addition(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		System.out.println("enter two double numbers");
		System.out.println(a.addition(sc.nextDouble(), sc.nextDouble()));
		
		System.out.println("enter  first integr and second double value");
		System.out.println(a.addition(sc.nextInt(), sc.nextDouble()));
		
		System.out.println("enter three float values");
		System.out.println(a.addition(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
		
		
	}
}
