package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo 
{
	public static void main(String[] args) 
	{
		File f=new File("data.txt");
		if (f.exists())
			System.out.println("File exists....");
		else
			try 
			{
				if(f.createNewFile())
					System.out.println("File has been created....");
				else
					System.out.println("error occurred.....");
			} 
		catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
