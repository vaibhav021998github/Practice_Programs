package practice;

public class Power 
{
	public int sqrt(int a)
	{ 
		int m;
		m= a*a;
		return(m);
	}
	public int cube(int b)
	{
		int p;
		p=b*b*b;
		return(p);
	}
	public static void main (String[] args)
	{
		Power power=new Power();
		int answer1=power.sqrt(25);
		System.out.println("Square of given no is =" + answer1);
		int answer2=power.cube(10);
		System.out.println("Cube of given no is =" + answer2);
		
	}
}
