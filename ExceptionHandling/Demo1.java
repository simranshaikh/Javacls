package ExceptionHandling;
import java.util.Scanner;
public class Demo1 {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4;
		try
		{
		System.out.println("Enter the index");
		int idx=sc.nextInt();
		System.out.println("Character at the entered index is : "+arr[idx]);
		String str="Ganesh";
		System.out.println("Enter the index");
		idx=sc.nextInt();
		System.out.println("Character at the entered index is : "+str.charAt(idx));
		}
		
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("For Array: Please enter values from 0 to 3...");
		}
		
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("For String: Please enter values from 0 to 5...");
		}
		
		catch(Exception e)
		{
			System.out.println("tu jaa ghar pe jaa k sooo jaa....tujhse naa ho payega...");
		}
		/*try
		{
			float ans=num/den;
			System.out.println("ans is :"+ans);
		}
		catch(ArithmeticException a)
		{
			System.out.println("please Enter a non-zero the denomenator.......");
		}
		*/
	}
}
