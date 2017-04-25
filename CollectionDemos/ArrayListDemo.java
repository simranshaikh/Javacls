package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Emp> a=new ArrayList<Emp>(50);
		a.add(10);
		a.add('A');
		a.add(true);
		a.add("Good");
		a.add(1.23);
		a.add(new Emp(1,5000,"Nikhil"));
		//1
		System.out.println(a);
		//2
		for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
		//3
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		}
}
