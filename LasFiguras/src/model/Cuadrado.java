package model;

public class Cuadrado implements Figura
{
	private double lado;

	public double area() 
	{
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public double perimetro() 
	{
		// TODO Auto-generated method stub
		return 4*lado;
	}
	
}
