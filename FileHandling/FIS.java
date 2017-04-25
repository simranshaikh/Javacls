package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS 
{
	public static void main(String[] args) 
	{
		File f=new File("data.txt");
		try 
		{
			FileInputStream fis=new FileInputStream("D:\\2007\\Day1\\src\\Associate.java");//data.txt can also be passed
			int ch;
			while ((ch=fis.read()) != -1)
			{
				System.out.print((char)ch);
			}
				
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
