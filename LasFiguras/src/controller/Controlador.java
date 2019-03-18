package controller;

import java.util.Scanner;
import model.*;

public class Controlador 
{
	static Scanner sc = new Scanner(System.in);
	static String com;
	
	public Controlador()
	{
		
	}
	public static void main(String[] args) 
	{
		boolean activo = true;
		while(activo == true) 
		{
			System.out.print("$> ");
			com = sc.next();
			switch(com)
			{
				default:
					System.out.println("Nope");
					break;
				case("quit"):
				{
					return;
				}
				case("esfera"):
				{
					System.out.print("Esfera $> ");
					String sphCom = sc.next();
					switch(sphCom)
					{
						default:
							System.out.println("Nope");
							break;
						case("quit"):
						{
							return;
						}
						case("volumen"):
						{
							System.out.print("Ingrese el valor del radio: ");
							double sphRad = sc.nextDouble();
							Esfera sphere = new Esfera();
							sphere.setRadio(sphRad);
							sphRad = sphere.volumen();
							System.out.println("El volumen de esta esfera es "+sphRad);
							break;
						}
					}
					break;
				}
			}
		}
	}
}
