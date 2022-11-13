import java.lang.*;

public class Rectangle extends Shape
{
	double y; //default. Accessible within the same package and subclasses

	public Rectangle()
	{
		System.out.println("Empty for Rectangle");
	}
    public Rectangle(double x, double y)
	{
		super(x);                  // parameterized constructor of parent class called
		this.y = y;
		System.out.println("parameterized for Rectangle");
	}
	public void setY(double y)
	{
		this.y =y;
	}
	public double getY()
	{
		return y;
	}
	public double getArea()
	{
		return x*y;            // method overriding
	}
}