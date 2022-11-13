import java.lang.*;

public class Square extends Shape
{
	public Square()
	{
		System.out.println("Empty for Square");
	}
    public Square(double x)
	{
		super(x);
		System.out.println("parameterized for Square");
	}
	public void setX()
	{
		this.x = x;
	}
	public double getx()
	{
		return x;
	}
	public double getArea()
	{
		return x*x;            // method overriding
	}
}