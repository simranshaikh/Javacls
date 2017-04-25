package Assignments;

public class FunctionOverloading 
{
	private int firstNo;
	private int secondNo;
	private int thirdNo;
	
	
	
	public int addition(int firstNo, int secondNo)
	{
		int result = firstNo + secondNo;
		return result;
	}
	
	public int addition(int firstNo, int secondNo, int thirdNo)
	{
		int result = firstNo + secondNo + thirdNo;
		return result;
	}
	
	public double addition( double firstNo, double secondNo )
	{
		double result = firstNo + secondNo;
		return result;
	}
	
	public double addition( int firstNo, double secondNo )
	{
		double result = firstNo + secondNo;
		return result;
	}
	
	public float addition( float firstNo, float secondNo, float thirdNo )
	{
		float result = firstNo + secondNo + thirdNo;
		return result;
	}
	
	
}
