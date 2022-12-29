package practice;

public class Result {

	public static void main(String[] args)
	{
		int percentage=64;
		
		if ((percentage<100)&&(percentage>75))
		{
			System.out.println("Congratualation you are in Distinction ");
		}
			else if((percentage<74) &&(percentage>60))
		{
			System.out.println("Congratualation you are in First Class");
		}
			else if((percentage<59)&&(percentage>55))
		{
			System.out.println("Congratualation you are in Higher Secondary Class");
		}
		else if ((percentage<55)&&(percentage>50))
		{
			System.out.println("congratualation you are in Second Class");
		}
		else if ((percentage>49)&&(percentage>40))
		{
			System.out.println("congratualation you are in Pass Class");
		}
		else
			{
				System.out.println("Sorry you are Fail");
			}
		}
	}	

