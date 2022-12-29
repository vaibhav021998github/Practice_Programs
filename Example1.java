package practice;

import java.util.Scanner;

public  class Example1 {
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the  Phyiscs marks" );
		int physics=sc.nextInt();
		System.out.println("Enter the  Chemistry marks") ;
		int chem=sc.nextInt();
		System.out.println("Enter the  Math marks" );
		int math=sc.nextInt();
		int answer=(physics+chem+math)/3;
		System.out.println("Average is :-" + answer);
	
	}

}
