
public class Test 
{
	public static void main(String a[])
	{
		Student st1=new Student();
		//st1.showStud();
		int r=st1.getRollno();
		System.out.println(r);
		
		String n=st1.getName();
		System.out.println(n);
		Student st2=new Student(9,"shankar");
		//st2.showStud();
		System.out.println(st2.getRollno());
		System.out.println(st2.getName());
	}
}
