package com.abc;

public class toString 
{
	String name;
	int rollno;
  toString(String name,int rollno)
  {
	  this.name=name;
	  this.rollno=rollno;
  }
 
	public static void main(String[] args) 
	{
		toString to=new toString("jagadeesh",101);
				toString to1=new toString("jagadeesh",101);
				System.out.println(to);
				System.out.println(to.toString());
				System.out.println(to1);
				

	}

}
//getclass().getName()+ "@"+Integer.toHexString(hashcode());