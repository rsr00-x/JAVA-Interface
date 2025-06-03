import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(5, 3);
		System.out.println("Base of Triangle is: " + t.getValue1());
		System.out.println("Height of Triangle is: " + t.getValue2());
		t.displayArea();
	}
}