import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
	Shape s = new Shape();
	s.setX(10.45);
	s.getX();
	Shape s1 = new Shape(11.67);

	Rectangle r = new Rectangle();
	r.setX(11.57);
	r.setY(12.90);

	r.getX();
	r.getY();
	System.out.println("The area of the Rectangle is: "+r.getArea()+" sq meters");
	Rectangle r1 = new Rectangle(11.78, 12.37);
	System.out.println("The area of the Rectangle 2 is: "+r1.getArea()+" sq meters");

	Square sq = new Square();
	sq.setX(11.90);

	r.getX();
	System.out.println("The area of the Square is: "+sq.getArea()+" sq meters");

	Square sq1 = new Square(11.29);
	System.out.println("The area of the Square 2 is: "+sq1.getArea()+" sq meters");

	}
}