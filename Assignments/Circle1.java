package Assignments;

public class Circle1 implements GeometryConstant, GeometryMethod 
{

	@Override
	public double calArea(double radius) {
		
		return (radius*radius*PI);
	}

	@Override
	public double calCircumference(double radius) {
		
		return (2*radius*PI);
	}

}
