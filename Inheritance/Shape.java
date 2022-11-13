import java.lang.*;

public class Shape
{
	protected double x;

	public Shape()
	{
		System.out.println("Empty for Shape");
	}
	public Shape(double x)
	{
		this.x=x;
		System.out.println("parameterized for Shape");
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public double getX()
	{
		return x;
	}
	public double getArea()
	{
		return -99999.9999;
	}
}