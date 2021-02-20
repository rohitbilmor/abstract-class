package com.abstractclass;
abstract class Shape
{
	public Shape()
	{
		System.out.println("Shape Constructor");
	}
	abstract double perimeter();
	abstract double area();
}
class Circle extends Shape
{
	public double radius;
	public Circle()
	{
		System.out.println("Circle Constructor");
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape
{
	public double length;
	public double breadth;
	public Rectangle()
	{
		System.out.println("Rectangle Constructor");
	}
	public double perimeter()
	{
		return 2*(length*breadth);
	}
	public double area()
	{
		return length*breadth;
	}
}
public class Abstract_Shape {

	public static void main(String[] args) {
		Shape sp;
		sp=new Circle();
		sp=new Rectangle();
		

	}

}
