package ExceptionHandling;

public class Doctor {
	private String degree;
	private String name;
	
	
	public String getDegree (){
		return degree;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDegree(String degree) throws DoctorException {
		if(degree.length()<0 ||degree.isEmpty()||degree.equals(null))
		this.degree = degree;
		else
			//throw new DoctorException("please enter degree");
			throw new DoctorException("invalid degree");
		
		
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", name=" + name + "]";
	
	}
}
	

