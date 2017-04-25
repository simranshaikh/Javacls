import java.util.Date;


public class Associate /*extends object*/
{
	private int id;
	private String name;
	private /*java.util.*/Date joinDate;
	public Associate(int id, String name, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 
	}
	*/
	
	@Override
	public String toString() {
		return "Associate [id=" + id + ", name=" + name + ", joinDate="
				+ joinDate + "]";
	}
	
	
	
	public void showData()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Id : "+this.name);
		System.out.println("Id : "+this.joinDate);
	}
	
}
