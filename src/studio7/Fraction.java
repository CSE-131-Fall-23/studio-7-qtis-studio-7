package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int numerator1, int denominator1) {
		// TODO Auto-generated constructor stub
		numerator = numerator1;
		denominator = denominator1;
	}
	public int getNumerator()
	{
		return this.numerator;
	}
	public int getDenominator()
	{
		return this.denominator;
	}
	public void print()
	{
		System.out.println(numerator);
		System.out.println("_");
		System.out.println(denominator);
	}
	public Fraction add(Fraction other)
	{
		int newDenominator = this.denominator * other.denominator;
		int newNum1 = this.numerator*other.denominator;
		int newNum2 = other.numerator*this.denominator;
		return new Fraction(newNum1+newNum2, newDenominator);
	}
	public Fraction product(Fraction other)
	{
		int newDenominator1 = this.denominator * other.denominator;
		int newNumerator1 = this.numerator * other.numerator;
		return new Fraction(newNumerator1, newDenominator1);
	}
	public Fraction reciprocal(Fraction other)
	{
		int newDenominator2 = this.numerator;
		int newNumerator2 = this.denominator;
		return new Fraction(newNumerator2, newDenominator2);
	}
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(4, 5);
		Fraction f2 = new Fraction(5, 8);
		Fraction f3 = f2.add(f1);
		f3.print();
		f3 = f2.product(f1);
		f3.print();
		f3 = f3.reciprocal(f3);
		f3.print();
	}
}
