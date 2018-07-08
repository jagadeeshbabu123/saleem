package com.abc;
class Test
{
	
}
class Example
{
	int x=10;
	int y=20;
}

public class Comparision 
{

	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		int z=10;
		System.out.println(x==z);
		System.out.println(x==y);
		//object creation
		Example e1=new Example();
		Example e2=new Example();
		Example e3=e2;
		
		Example e4=null;
		Example e5=new Example();
		Test t1=new Test();
		System.out.println(e1==e2);
		System.out.println(e2==e3);
	//	System.out.println(e1==t1);
		System.out.println(e1.equals(e2));
       System.out.println(e2.equals(e3));
       System.out.println(e1.equals(t1));
       System.out.println(null==null);
       System.out.println(null==e4);
       System.out.println(null==e5);
       System.out.println(null==new Example());
       
	}

}
