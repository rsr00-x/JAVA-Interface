import java.lang.*;

public class Triangle extends Shape implements IFirstInterface, ISecondInterface
{
	public Triangle()
	{
		super();
	}
	
	public Triangle(double value1, double value2)
	{
		super(value1, value2);
	}
	
	public void setValue1(double value1){this.value1 = value1;}
	public void setValue2(double value2){this.value2 = value2;}
	public double getValue1(){return this.value1;}
	public double getValue2(){return this.value2;}
	
	public void displayArea()
	{
		System.out.println("Area of the Triangle is: " + (0.5*this.value1*this.value2));
	}
}
