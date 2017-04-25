
public class Trainer extends Person
{
	private int num_of_skills;
	private int expInYrs;
	public Trainer(String fname, String lname, String address, int skills, int exp)
	{
		super(fname, lname, address);
		// TODO Auto-generated constructor stub
		this.num_of_skills=skills;
		this.expInYrs=exp;
	}

	public void TrainerKaMethod()
	{
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.num_of_skills);
		System.out.println(this.expInYrs);
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
