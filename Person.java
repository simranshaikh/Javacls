
public abstract class Person
{
	private String fname;
	private String lname;
	private String address;
	public Person(String fname, String lname, String address) 
	{
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	
	
	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() 
	{
		return "Person [fname=" + fname + ", lname=" + lname + ", address="
				+ address + "]";
	}
	
	public abstract void showDetails();
}
