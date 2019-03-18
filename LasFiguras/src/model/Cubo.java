package model;

public class Cubo implements Figura, Figura3D
{
	private double lado;

	@Override
	public double volumen() 
	{
		// TODO Auto-generated method stub
		return lado*lado*lado;
	}

	@Override
	public double area() 
	{
		// TODO Auto-generated method stub
		return 6*(lado*lado);
	}

	@Override
	public double perimetro() 
	{
		// TODO Auto-generated method stub
		return 12*lado;
	}

}
