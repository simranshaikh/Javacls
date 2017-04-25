package Assignments;

public class SubTest extends Subtraction 
{

	@Override
	public int subtraction(int firstNo, int secondNo) {
		
		return (firstNo-secondNo);
	}

	@Override
	public int subtraction(int firstNo, int secondNo, int thirdNo) {
		
		return (firstNo-secondNo-thirdNo);
	}

	@Override
	public double subtraction(double firstNo, double secondNo) {
		
		return (firstNo-secondNo);
	}

	@Override
	public double subtraction(int firstNo, double secondNo) {
		
		return (firstNo-secondNo);
	}

	@Override
	public float subtraction(float firstNo, float secondNo, float thirdNo) {
		
		return (firstNo-secondNo-thirdNo);
	}
	
}
