package practice;

public class Calculator {
public int  add(int a, int b)
	{
	int sum;
	sum=a+b;
	return(sum);
	}

public int  sub(int a,int b)
{
int sub;
sub=a-b;
return(sub);
}
public int multi(int a,int b)
{
	int multi;
	multi=a*b;
	return(multi);
	}
public int div(int a,int b)   
{
	int div;
	div=a/b;
	return(div);
	}
public int mod(int a,int b)   
{
	int mod;
	mod=a%b;
	return(mod);
	}


	public static void main(String[] args) 
	{
		Calculator calculator=new Calculator();
			int ans1=calculator.add(4,4);
				System.out.println("Sum="+ans1);
				int ans2=calculator.sub(2,2);
				System.out.println("Substraction="+ans2);
				int ans3=calculator.multi(2,2);
				System.out.println("Multiplication="+ans3);
				int ans4=calculator.div(2,2);
				System.out.println("Divison="+ans4);
				int ans5=calculator.mod(5,2);
				System.out.println("Modulus="+ans5);
				
	}

}
