package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	

	public Rectangle(double length1, double width1) {
		// TODO Auto-generated constructor stub
		this.length = length1;
		this.width = width1;
		this.area = length1 * width1;
		this.perimeter = (2*length1)+(2*width1);
	}
//	public static double area()
//	{
//		return length*width;
//	}
//	public static double perimeter(double length1, double width1)
//	{
//		return (2*length1)+(2*width1);
//	}
//	//	public void print()
	//	{
	//		System.out.println("Area: " + )
	//	}
	public void print() {
		System.out.println("Length: " + this.length);
		System.out.println("Width: " + this.width);
		System.out.println("Area: " + this.area);
		System.out.println("Perimeter: " + this.perimeter);
	}
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(2.0, 5.0);
		r1.print();
		Rectangle r2 = new Rectangle(1.0, 3.0);
		r2.print();
		
		if(r1.area > r2.area) {
			System.out.println("R1 is larger in area than R2");
		}
		else if(r1.area == r2.area) {
			System.out.println("R1 is equal in area R2");
		}
		else{
			System.out.println("R1 is not larger in area than R2");
		
		}
		if(r1.length == r1.width)
		{
			System.out.println("R1 is a square");
		}
		else
		{
			System.out.println("R1 is not a square");
		}
	}

}
