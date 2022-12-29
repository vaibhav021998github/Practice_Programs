package practice;

public class StarPattern2 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) // for row printing
		{ 
			for(int j=1;j<=i;j++) // for column printing
			{
				System.out.print("*");
			}
		System.out.println();	// this for upper triangle printing 
		} 
			for(int k=1;k<=4;k++) // for row printing 
				{
					for(int l=4;l>=k;l--)  // for column printing 
					{
						System.out.print("*");
					}
			System.out.println(); // this for lower triangle printing 
				}
}
}