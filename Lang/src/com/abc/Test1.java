
package com.abc;

 class contract
{
 int sno;
 String sname;
 int Which;
contract (int sno,String sname, int Which)
 {
	 this.sno=sno;
	 this.sname=sname;
	 this.Which=Which;
 }
 public boolean equals(Object obj)
 {
	 if(this==obj)
	 {
		 return true;
	 }
	 else if(obj instanceof contract)
	 {
		 contract c=(contract)obj;
		 return(this.sno==c.sno && this.sname.equals(c.sname)&&this.Which==c.Which);
				 
	 }
	 else
	 {
		 return false;
	 }
 }
 public int hashCode()
 {
	 return (sno + sname.length()+Which);
 }
}
class Test1
{
	public static void main(String[] args) {
		contract c=new contract(1,"jaga",9);
		contract c1=new contract(1,"jaga",9);
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode()==c1.hashCode());
	}
}