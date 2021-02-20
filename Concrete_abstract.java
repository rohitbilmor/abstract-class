package com.abstractclass;
//class Super //error 
abstract class Super

{
	public Super()
	{
		System.out.println("Super Constructor");
	}
	public void meth1()
	{
		System.out.println("Meth1 Super");
	}
	abstract public void meth2();
}
class Sub extends Super
{
	public Sub()  //has method of abstract but changed to concrete.So no abstract 
	{
		System.out.println("Sub Constructor");
	}
	public void meth2()  //Overriding abstract to concrete method
	{
		System.out.println("Meth2 Sub");
	}
}
public class Concrete_abstract {

	public static void main(String[] args) {
		Super sr;    //Can create reference to abstract class
		//sr=new Super(); cannot create object
		Sub su=new Sub();
		su.meth2();
	}

}
