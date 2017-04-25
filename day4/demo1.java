package day4;

public class demo1 {
	//a reference to an array of String type
	public static void main(String args[]) {
		//String class is immutable
		String s="Tom";
		System.out.println(s.hashCode());
		s=s.concat("jerry");
		System.out.println(s.hashCode());
		
		
	//String Buffer class is mutable
		StringBuffer sb1=new StringBuffer("Tom");
		System.out.println(sb1.hashCode());
		sb1=sb1.append("jerry");
		System.out.println(sb1.hashCode());
		
		//StringBuilder class is mutable
		StringBuilder sb2=new StringBuilder("Tom");
		System.out.println(sb2.hashCode());
		sb2=sb2.append("jerry");
		System.out.println(sb2.hashCode());
	}
}
