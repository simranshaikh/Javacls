package Application;

import java.util.Scanner;

import Techm.Employee;

public class EmployeeData 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employee details.....");
		System.out.println("1.empNo");
		System.out.println("2.empName");
		System.out.println("3.empSal");
		Employee e1=new Employee(s.nextInt(), s.next(), s.nextInt());
		Employee e2=new Employee(s.nextInt(), s.next(), s.nextInt());
		
	}
}
