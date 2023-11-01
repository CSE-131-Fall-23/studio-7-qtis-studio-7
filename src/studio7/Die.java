package studio7;

public class Die {
	private int n;
	private int random;
	public Die(int sides, int random1) {
		n = sides;
		random = random1;
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		System.out.println(this.random);
	}
	public static void main(String[] args)
	{
		int x = 6;
		Die d1 = new Die(x, (int)(Math.random()*x+1));
		d1.print();
	}

}
