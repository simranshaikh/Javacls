
public class Student {
	private int rollno;
	private String name;
	//default constructor
	public Student()
	{
		System.out.println("in default constructor");
	}
	public Student(int roll, String nm)
	{
		rollno=roll;
		name=nm;
		System.out.println("in student para constructor");
	}
	int getRollno()
	{
		return rollno;
	}
	String getName()
	{
		return name;
	}
	
	public void showStud()
	{
		System.out.println("Roll no : " +rollno+ "\n Name : " +name);
	}
}