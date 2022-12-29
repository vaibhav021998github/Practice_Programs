package practice;

public class A {
	A m1() 
	{
	A ob1=new A();
	System.out.println("This is Class A Method");
	return ob1;
	} 
}
 class B extends A
	{
		B m1()
		{
			B ob2=new B();
			System.out.println("This is Class B Method");
			return ob2;
		}
	}
 

