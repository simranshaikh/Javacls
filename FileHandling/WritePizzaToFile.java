package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePizzaToFile 
{
	public static void main(String[] args) 
	{
		//1.creating the object
		Pizza p=new Pizza("Delux Margarita", 5);
		
		//2.write an object into the file-FOS , DOS
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("pizza.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeBytes(p.toString());
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

		
		//3.read an object from the file - FIS , DIS
		
		
		
		//4.Closing all resources
	}
}
