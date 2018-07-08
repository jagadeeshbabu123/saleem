package com.abc;
// tostring() method not overridden
/*
 package com.abc;


public class A 
{
  int X;
  A(int X)
  {
	  this.X=X;
  }
  public static void main(String[] args)
  {
	   A a1= new A(5);
	   A a2= new A(6);
	   System.out.println(a1);
	   System.out.println(a2);
}
}
*/
 // toString() method overrideden in subclass
class A
{
  int X;
  A(int X)
  {
	  this.X=X;
  }
  public String toString()
  {
	  return "" +X;
  }
  class Test
  {
 // public static void main(String[] args)
  {
	   A a1= new A(5);
	   A a2= new A(6);
	   System.out.println(a1);
	   System.out.println(a2);
  }
  }
}