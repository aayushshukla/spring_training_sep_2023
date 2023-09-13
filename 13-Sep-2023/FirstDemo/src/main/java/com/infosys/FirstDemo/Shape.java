package com.infosys.FirstDemo;

public interface Shape {
	
	// methods will be public and abstract 
	// abstract method a method that have declaration 
	// but dont have defination
	public abstract void area();

}
class Circle implements Shape
{
	public void area()
	{
		System.out.println(3.14*4*4);
		
	}
	public static void main(String[] args) {
		Circle c =new Circle();
		c.area();
	}

}
