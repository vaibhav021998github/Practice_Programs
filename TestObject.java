package practice;
 class TestObject { 
	int i,j;
	 void setData(int x, int y)
	{
		i=x;
		j=y;
	} 
	public void getData()
	{
		System.out.println(i);
		System.out.println(j);
	}

	TestObject addObject(TestObject obj1 , TestObject obj2)
	{
		TestObject temp=new TestObject();
		temp.i=obj1.i+obj2.i;
		temp.j=obj1.j+obj2.j;
		return temp;
		
	}
	
	public static void main(String[] args) 
	{
		TestObject obj1=new TestObject();
		TestObject obj2=new TestObject();
		TestObject obj3=new TestObject();
		obj1.setData(50, 100);
		obj2.setData(25, 80);
		obj3=obj3.addObject(obj1, obj2);
		obj3.getData();
		

	}

}
