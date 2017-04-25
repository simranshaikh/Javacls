package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class PizzaHut 
{
	public static void main(String[] args) 
	{
		Pizza p=new Pizza("Delux Margarita", 5);
		
		try 
		{
			//1.serialisation-FOS, OOS
			FileOutputStream fos=new FileOutputStream("pizzinfo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			fos.close();
			oos.close();
			
			//2.deserialisation-FIS, OIS
			FileInputStream fis=new FileInputStream("pizzinfo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pizza p1=(Pizza) ois.readObject();  //returning a object
			System.out.println(p1);
			fis.close();
			ois.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
