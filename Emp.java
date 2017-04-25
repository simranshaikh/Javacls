
public class Emp 
{
	int id, salary;
	String name;
	
	public Emp() 
	{
		super();
	}
	public Emp(int id, int salary, String name)
	{
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		Emp etemp=(Emp) arg0;
		return false;
	}
	public void  showInfo()
	{
		System.out.println("id = "+id+" \n name "+name+" \n salary "+salary);
	}
}
