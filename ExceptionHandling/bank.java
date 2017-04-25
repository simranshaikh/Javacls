package ExceptionHandling;
import java.util.Scanner;

import javax.security.auth.login.AccountException;
public class bank {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Account a=new Account();
		try {
			a.setAccid(s.next());
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		a.setAcctype(s.next());
		System.out.println(a);
	}
}
