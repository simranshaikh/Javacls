import java.util.Date;


public class ELITian extends Associate 
{
	private int groupId;
	private String mappedIBU;
	
	
	public ELITian(int id, String name, Date joinDate, int gId, String IBU) 
	{
		super(id, name, joinDate);
		// TODO Auto-generated constructor stub
		this.groupId=gId;
		this.mappedIBU=IBU;
		
	}


	/*@Override
	public String toString()
	{
		return "ELITian [groupId=" + groupId + ", mappedIBU=" + mappedIBU
				+ ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getJoinDate()=" + getJoinDate() + "]";
	}
	*/
	public int getGroupId() {
		return groupId;
	}


	public String getMappedIBU() {
		return mappedIBU;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString()+" "+getGroupId()+" "+getMappedIBU();
	}


	
}
	
	

