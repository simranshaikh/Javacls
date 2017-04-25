package CollectionDemos;
import java.util.Enumeration;
import java.util.HashMap;
public class HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1699,"Tushar");
		hm.put(2007,"Anil");
		hm.put(3153,"Kriti");
		hm.put(5421,"Arjay");
		
		System.out.println(hm);
		//1
		//for(int i=0 ; i<hm.size() ; i++)
			//System.out.println(hm.);
		
		//2
		Enumeration e=(Enumeration) hm.entrySet();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
